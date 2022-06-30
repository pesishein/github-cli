package com.sheinfeld.cli.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.freva.asciitable.AsciiTable;
import com.github.freva.asciitable.Column;
import com.github.freva.asciitable.HorizontalAlign;
import com.sheinfeld.cli.config.Config;
import com.sheinfeld.cli.config.ConfigKeys;
import com.sheinfeld.cli.pojos.StatData;
import com.sheinfeld.cli.service.GithubHandler;
import com.sheinfeld.cli.util.Messages;
import com.sheinfeld.cli.util.MessagesKeys;
import com.sheinfeld.cli.util.RestServices;

import picocli.CommandLine.Command;

@Command(name = "--stats", description = "Present the stats of the repo (stars, forks, language, contributors)")
public class StatsCommand extends AbstractSubCommand {

	private static Logger logger = LogManager.getLogger(StatsCommand.class);

	@Override
	public void run() {
		logger.info("Stats command - START with [repo=" + this.repo + "], [outputFile=" + this.outputFile + "]");

		if (!isValidInput()) {
			return;
		}

		try {
			List<StatData> statsDataList = new ArrayList<StatData>(); 
//			statsDataList.add(createStatData("stars"));
//			statsDataList.add(createStatData("forks"));
//			statsDataList.add(createStatData("contributors"));
//			statsDataList.add(createStatData("languages"));
			
			statsDataList.add(createStatData(StatType.STARS));
			statsDataList.add(createStatData(StatType.FORKS));
			statsDataList.add(createStatData(StatType.CONTRIBUTORS));
			statsDataList.add(createStatData(StatType.LANGUAGES));

			Character[] borderStyle = AsciiTable.BASIC_ASCII;

			String statsTable = AsciiTable.getTable(borderStyle, statsDataList , Arrays.asList(
			        new Column().header("STAT").headerAlign(HorizontalAlign.CENTER).
		        	dataAlign(HorizontalAlign.LEFT).with(stats -> stats.getKey() ),
		        new Column().header("VALUE").headerAlign(HorizontalAlign.CENTER).
        			dataAlign(HorizontalAlign.CENTER).with(stats -> String.valueOf(stats.getValue()))));
			
			boolean printToConsole = true;
			
			if (this.outputFile != null) {
				printToConsole = writeToFile(statsTable);
			}
			
			if(printToConsole) {
				System.out.println(System.lineSeparator() + statsTable);
				logger.info("Stats command - data was written to console" );
			}

			
			logger.info("Downloads command - END");
			
		} catch (ClientProtocolException e) {
			if (e.getMessage().equals("404")) { 
				System.out.println(Messages.getMessage(MessagesKeys.NO_REPO_FOUND));
				return;
			}

		} catch (Exception e) {
			logger.error("Failed fetching data : ", e);
			return;
		}
	}
	
	private StatData createStatData(StatType statType) throws Exception {
		
		GithubHandler controller = new GithubHandler();
		
		String url = Config.getSetting(ConfigKeys.BASE_URL);
		url = url + "/" + this.repo + "/" + Config.getSetting(statType.label+"Suffix");		
		String json = RestServices.callHttpGet(url);
		
		if(statType.equals(StatType.FORKS)) {
			Integer forksCount = controller.getForksCount(json);
			return new StatData(StatType.FORKS.label, forksCount);
		}
		
		if(statType.equals(StatType.CONTRIBUTORS)) {
			Integer contsCount = controller.getContributorsCount(json);
			return new StatData(StatType.CONTRIBUTORS.label, contsCount);
		}
		
		if(statType.equals(StatType.LANGUAGES)) {
			String languages = controller.getLanguages(json);
			return new StatData(StatType.LANGUAGES.label, languages);
		}
		
		if(statType.equals(StatType.STARS)) {
			Integer starsCount = controller.getStarsCount(json);
			return new StatData(StatType.STARS.label, starsCount);
		}
		return null;
	}

}

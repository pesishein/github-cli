package com.sheinfeld.cli.commands;

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
import com.sheinfeld.cli.pojos.DownloadsData;
import com.sheinfeld.cli.service.GithubHandler;
import com.sheinfeld.cli.util.Messages;
import com.sheinfeld.cli.util.MessagesKeys;
import com.sheinfeld.cli.util.RestServices;

import picocli.CommandLine.Command;

@Command(name = "--downloads", description = "Present the entire downloads for each asset")
public class DownloadsCommand extends AbstractSubCommand {

	public static final String DOWNLOADS_SUFFIX = "downloadsSuffix";

	private static Logger logger = LogManager.getLogger(DownloadsCommand.class);

	@Override
	public void run() {
		logger.info("Downloads command - START with [repo=" + this.repo + "], [outputFile=" + this.outputFile + "]");
		if (!isValidInput()) {
			return;
		}

		List<DownloadsData> downloadsDataList = null;
		GithubHandler controller = new GithubHandler();
		try {
			String url = Config.getSetting(ConfigKeys.BASE_URL);
			url = url + "/" + this.repo + "/" + Config.getSetting(DOWNLOADS_SUFFIX);
			String releases = RestServices.callHttpGet(url);
			downloadsDataList = controller.getDownloadsData(releases);
		} catch (ClientProtocolException e) {
			if (e.getMessage().equals("404")) {
				System.out.println(Messages.getMessage(MessagesKeys.NO_ASSETS_FOUND));
				logger.info("Downloads request returned 404. No assests message displayed");
				return;
			}
		} catch (Exception e) {
        	System.out.println("An error has occoured, see logs for details");
			logger.error("Downloads command failed fetching data : ", e);
			return;
		}

		if (downloadsDataList == null || downloadsDataList.isEmpty()) {
			System.out.println(Messages.getMessage(MessagesKeys.NO_ASSETS_FOUND));
			logger.info("Downloads data list is empty. No assests message displayed");
			return;
		}

		Character[] borderStyle = AsciiTable.BASIC_ASCII;

		String downloadsTable = AsciiTable.getTable(borderStyle, downloadsDataList,
				Arrays.asList(
						new Column().header("RELEASE NAME").headerAlign(HorizontalAlign.CENTER)
								.dataAlign(HorizontalAlign.LEFT).with(downloadsData -> downloadsData.getReleaseName()),
						new Column().header("DISTRIBUTION").headerAlign(HorizontalAlign.CENTER)
								.dataAlign(HorizontalAlign.LEFT).with(downloadsData -> downloadsData.getDistribution()),
						new Column().header("DOWNLOADS COUNT").headerAlign(HorizontalAlign.CENTER)
								.dataAlign(HorizontalAlign.CENTER)
								.with(downloadsData -> String.valueOf(downloadsData.getDownloadCount()))));

		boolean printToConsole = true;
		
		if (this.outputFile != null) {
			printToConsole = writeToFile(downloadsTable);
		}
		
		if(printToConsole) {
			System.out.println(System.lineSeparator() + downloadsTable);
			logger.info("Downloads command - data was written to console" );
		}

		logger.info("Downloads command - END");
	}
}

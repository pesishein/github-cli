package com.sheinfeld.cli.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sheinfeld.cli.config.Config;
import com.sheinfeld.cli.config.ConfigKeys;
import com.sheinfeld.cli.util.Messages;
import com.sheinfeld.cli.util.MessagesKeys;

import picocli.CommandLine.Option;

public abstract class AbstractSubCommand implements Runnable {

	private static Logger logger = LogManager.getLogger(AbstractSubCommand.class);
	
	@Option(names = { "-r", "--repo" }, description = "The repository to analyze", required = true)
	protected String repo;

	@Option(names = { "-o", "--output" }, description = "The output path of the txt file (default: print to console)")
	protected File outputFile;

	protected boolean isValidRepository() {
        final Pattern pattern = Pattern.compile(Config.getSetting(ConfigKeys.REPO_REGEX));
        final Matcher matcher = pattern.matcher(repo);
        return matcher.matches();
	}
	
	protected boolean isValidInput() {
		if(!isValidRepository()) {
			System.out.println(Messages.getMessage(MessagesKeys.INVALID_REPO));
			return false;
		}

		return true;
	}
	
	protected boolean writeToFile(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(outputFile);
			writer.write(text);
			System.out.println("Data was written to file : " + outputFile.getPath());
			logger.info("Data was written to file : " + outputFile.getPath());
		} catch (IOException e) {
			System.out.println("Failed writing to file : " + e.getMessage());
			logger.info("Failed writing to file : " + e.getMessage());
			return false;
		}finally {
			try {
				if(writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.out.println("Failed writing to file : " + e.getMessage());
				logger.info("Failed writing to file : " + e.getMessage());
				return false;
			}
		}
		return true;
	}
	
	abstract public void run();

}

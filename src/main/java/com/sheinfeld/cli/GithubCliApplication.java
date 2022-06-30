package com.sheinfeld.cli;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sheinfeld.cli.commands.DownloadsCommand;
import com.sheinfeld.cli.commands.StatsCommand;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "githubCli", mixinStandardHelpOptions = true, version = "GithubCli 1.0", description = "Cli for github commands/n",
subcommands = {
	      DownloadsCommand.class,
	      StatsCommand.class
	  })
public class GithubCliApplication {

	private static Logger logger = LogManager.getLogger(GithubCliApplication.class);

	@Option(names = { "-h", "--help" }, usageHelp = true, description = "Print information about each command")
	private boolean help;

	
	public static void main(String[] args) {
		logger.info("Github CLI - START ");
		int exitStatus = new CommandLine(new GithubCliApplication()).execute(args);
		logger.info("Github CLI - END with exit status = " + exitStatus);
		System.exit(exitStatus);
	}
}
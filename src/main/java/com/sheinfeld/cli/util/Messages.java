package com.sheinfeld.cli.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sheinfeld.cli.config.Config;

public class Messages {

    private static final Properties properties = new Properties();
	private static Logger logger = LogManager.getLogger(Messages.class);

    static {
    	try (InputStream inputStream = Config.class.getClassLoader().getResourceAsStream("messages.properties")) {			
            properties.load(inputStream);
        } catch (IOException e) {
        	logger.error("Failed initializing messages file", e);
        	System.out.println("An error has occoured, see logs for details");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getMessage(String key) {
        return properties.getProperty(key);
    }

}

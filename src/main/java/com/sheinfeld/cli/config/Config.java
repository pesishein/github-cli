package com.sheinfeld.cli.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Config {

    private static final Properties properties = new Properties();
	private static Logger logger = LogManager.getLogger(Config.class);
	
    static {   	
        try (InputStream inputStream = Config.class.getClassLoader().getResourceAsStream("config.properties")) {			
            properties.load(inputStream);
        } catch (IOException e) {
        	logger.error("Failed initializing config properties", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getSetting(String key) {
        return properties.getProperty(key);
    }

}

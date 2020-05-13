package com.rjdaytrade.restClient.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertyReader {
	private final Properties configProp = new Properties();

	private PropertyReader() {
		// Private constructor to restrict new instances
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("config.properties");
		try {
			configProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Bill Pugh Solution for singleton pattern
	private static class LazyHolder {
		private static final PropertyReader INSTANCE = new PropertyReader();
	}

	public static PropertyReader getInstance() {
		return LazyHolder.INSTANCE;
	}

	public String getProperty(String key) {

		return configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return configProp.stringPropertyNames();
	}

	public boolean containsKey(String key) {
		return configProp.containsKey(key);
	}
}
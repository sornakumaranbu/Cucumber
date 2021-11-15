package com.configreader.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;

	public ConfigurationReader() throws Throwable {

		File fl = new File(
				"C:\\Users\\hp\\eclipse-workspace\\Cucumber_AdactingProject\\src\\test\\java\\com\\datafile\\com\\data.properties");
		
		FileInputStream fis = new FileInputStream(fl);
		
		p = new Properties();
		
		p.load(fis);

	}

	public String getBrowser() {

		String browser = p.getProperty("Browser");
		
		return browser;
	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getuserName() {
		
		String uname = p.getProperty("username");
		
		return uname;
	}
	
	public String getpassword() {

		String pass = p.getProperty("password");
		
		return pass;
	}
	
	public String getcreditcard() {

		String card = p.getProperty("creditcard");
		
		return card;
	}
}

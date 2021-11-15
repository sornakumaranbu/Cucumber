package com.filereader.com;

import com.configreader.com.ConfigurationReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {

		FileReaderManager fr = new FileReaderManager();
		
		return fr;
		
	}

	public  ConfigurationReader getInstanceCR() throws Throwable {

		ConfigurationReader cr = new ConfigurationReader();
		
		return cr;
		
	}
}

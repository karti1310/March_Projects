package com.Configuration.helper;

import java.io.IOException;

public class FileReaderManager {
	
	
	
	public FileReaderManager() throws IOException {
		
	}

	public static FileReaderManager getInstancefrm() throws IOException {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getInstancecr() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	
	}
}

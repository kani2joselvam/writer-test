package com.digital14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter implements Writer{

	private String textToWrite;
	private String filePath = "./out.dat";
	private java.io.FileWriter fw =  new java.io.FileWriter(new File(filePath));
	
	
	
	
	public FileWriter(String text) throws IOException{
		this.textToWrite = text;
	}
	
	
	@Override
	public Writer lowerCase() throws Exception {
		this.textToWrite = textToWrite.toLowerCase();
		return this;
	}

	@Override
	public Writer upperCase() throws Exception {
		this.textToWrite = textToWrite.toUpperCase();
		return this;
		
	}

	@Override
	public Writer stupidRemover()throws Exception {
		this.textToWrite = textToWrite.replace("stupid","s*****");
		return this;
	}

	@Override
	public Writer duplicateRemover() throws Exception {
		this.textToWrite = textToWrite.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
		return this;
	}
	
	@Override
	public Writer write() throws Exception {
		fw.write(textToWrite);
		fw.close();

		return this;
	}


	@Override
	public void close() throws Exception {
		fw.close();
		
	}

	@Override
	public String readContent() throws Exception {
	    String data = readFileAsString(filePath);
		return data;
	}

	public static String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	  }
}

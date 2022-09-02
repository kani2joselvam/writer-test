package com.digital14;

public class StringWriter implements Writer{

	private String textToWrite ;
	
	
	public StringWriter(String text){
		this.textToWrite = text;
	}
	
	public Writer lowerCase(){
		this.textToWrite = textToWrite.toLowerCase();
		return this;
	}
	
	public Writer upperCase(){
		this.textToWrite = textToWrite.toUpperCase();
		return this;
		
	}
	public Writer stupidRemover(){
		this.textToWrite = textToWrite.replace("stupid","s*****");
		return this;
		
	}
	public Writer duplicateRemover(){
		this.textToWrite= textToWrite.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
		return this;
	}


	@Override
	public Writer write(){
		return this;
	}
	
	@Override
	public void close() {
		
	}

	@Override
	public String readContent() {
		return this.textToWrite;
	}

}

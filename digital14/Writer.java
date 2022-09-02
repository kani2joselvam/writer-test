package com.digital14;

public interface Writer {

	public Writer lowerCase() throws Exception; 
	public Writer upperCase() throws Exception;
	public Writer stupidRemover() throws Exception;
	public Writer duplicateRemover() throws Exception;
	public Writer write() throws Exception;
	public void close() throws Exception;
	public String readContent() throws Exception;

}

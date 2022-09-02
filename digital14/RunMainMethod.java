package com.digital14;


public class RunMainMethod {

	 public static void main(String[] args) throws Exception{
		 Writer textWriter = null;String content = null;
		 
		  try {
			textWriter = new FileWriter("This is is really a good good coding task");
			  
			  content =textWriter.duplicateRemover()
					  			.stupidRemover()
					  			.lowerCase()
					  			.write()
					  			.readContent();
		} catch (Exception e) {
			System.out.println("Internal error occured."+e.getMessage());
		}
		  
		  System.out.println(content);

	 }

}

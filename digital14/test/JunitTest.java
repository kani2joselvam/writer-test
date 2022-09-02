package com.digital14.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.digital14.FileWriter;
import com.digital14.StringWriter;
import com.digital14.Writer;

public class JunitTest {
	
	@Test
	public void testStringWriterLowerCase() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new StringWriter("This is is really good good coding task");		  
		content =textWriter.lowerCase()
				  			.write()
				  			.readContent();
		  
		  assertEquals("this is is really good good coding task", content);
	}
	
	@Test
	public void testStringWriterDuplicateRemover() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new StringWriter("This is is really good good coding task");		  
		content =textWriter.duplicateRemover()
				  			.write()
				  			.readContent();
		  
		  assertEquals("This is really good coding task", content);
	}
	
	@Test
	public void testStringWriterStupidRemover() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new StringWriter("It all sounds so utterly stupid now.");		  
		content =textWriter.stupidRemover()
				  			.write()
				  			.readContent();
		  
		  assertEquals("It all sounds so utterly s***** now.", content);
	}

	@Test
	public void testStringWriter() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new StringWriter("This is is really good good coding task");		  
		content =textWriter.duplicateRemover()
				  			.stupidRemover()
				  			.lowerCase()
				  			.write()
				  			.readContent();
		  
		  assertEquals("this is really good coding task", content);
	}

	
	@Test
	public void testFileWriterLowerCase() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new FileWriter("This is is really good good coding task");		  
		content =textWriter.lowerCase()
				  			.write()
				  			.readContent();
		  
		  assertEquals("this is is really good good coding task", content);
	}
	
	@Test
	public void testFileWriterDuplicateRemover() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new FileWriter("This is is really good good coding task");		  
		content =textWriter.duplicateRemover()
				  			.write()
				  			.readContent();
		  
		  assertEquals("This is really good coding task", content);
	}
	
	@Test
	public void testFileWriterStupidRemover() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new FileWriter("It all sounds so utterly stupid now.");		  
		content =textWriter.stupidRemover()
				  			.write()
				  			.readContent();
		  
		  assertEquals("It all sounds so utterly s***** now.", content);
	}

	@Test
	public void testFileWriter() throws Exception {
		Writer textWriter = null;String content = null;
		textWriter = new FileWriter("This is is really good good coding task");		  
		content =textWriter.duplicateRemover()
				  			.stupidRemover()
				  			.lowerCase()
				  			.write()
				  			.readContent();
		  
		  assertEquals("this is really good coding task", content);
	}

}

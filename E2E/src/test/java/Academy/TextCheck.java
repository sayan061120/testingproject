package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.TextObject;
import objectrepository.WhatsnewObject;

public class TextCheck extends TestBase  {
	@Test
	
	public void Textcheckobject() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		TextObject to=new TextObject(driver);
		
		System.out.println(to.Check().getText());
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}

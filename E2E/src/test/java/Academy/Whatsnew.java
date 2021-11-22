package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.WhatsnewObject;
import objectrepository.WishList;

public class Whatsnew extends TestBase  {
	@Test
	
	public void WhatsnewPage() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		WhatsnewObject wo=new WhatsnewObject(driver);
		wo.Submit().click();
		System.out.println(wo.Check().getText());
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}


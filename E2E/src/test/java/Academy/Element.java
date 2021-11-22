package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.CheckObject;
import objectrepository.ElementObject;

public class Element extends TestBase   {
	 
	@Test
	
	public void WishList() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		ElementObject eo=new ElementObject(driver);
		eo.Lord().click();
		System.out.println(eo.Check().getText());
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}


}

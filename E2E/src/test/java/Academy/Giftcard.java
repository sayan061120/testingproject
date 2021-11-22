package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.CheckObject;
import objectrepository.Giftcardobject;

public class Giftcard extends TestBase   {
	 
	@Test
	
	public void GiftcardCheck() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		Giftcardobject go=new Giftcardobject(driver);
		go.Gift().click();
		System.out.println(go.Text().getText());
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}


}


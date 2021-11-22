package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.WishList;
import objectrepository.cardobject;

public class CheckCard extends TestBase  {
	@Test
	
	public void CardPage() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		cardobject co=new cardobject(driver);
		co.Card().click();
		System.out.println(co.Check().getText());
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}


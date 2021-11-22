package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.Addto;
import objectrepository.WishList;

public class AddToCard extends TestBase  {
	@Test
	
	public void AddPage() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/products/lord-shiva-adiyogi-figurine");
		
		Addto at=new Addto(driver);
		at.Submit().click();
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}


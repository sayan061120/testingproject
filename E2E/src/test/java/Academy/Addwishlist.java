package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import objectrepository.WishList;

public class Addwishlist extends TestBase  {
	@Test
	
	public void WishPage() throws IOException {
		
driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		WishList wl=new WishList(driver);
		wl.Homedecor().click();
		wl.Bulb();
		wl.Add();
		
		
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}

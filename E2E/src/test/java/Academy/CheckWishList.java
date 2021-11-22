package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.CheckObject;
import objectrepository.WishList;

public class CheckWishList extends TestBase   {
	 
			@Test
			
			public void WishList() throws IOException {
				
		driver=initializerDriver();
				
				driver.get("https://www.bigsmall.in/");
				
				CheckObject co=new CheckObject(driver);
				co.Wishlist().click();
				System.out.println(co.Checklist().getText());
				
				
				
			}
			@AfterTest
			public void close() {
				driver.close();
			}


}

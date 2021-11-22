package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import objectrepository.LoginPage;







public class HomePage extends TestBase {
	
	@Test
public void basePageNavigation() throws IOException {
		
		driver=initializerDriver();
		
		
		driver.get("https://www.bigsmall.in/");
		LoginPage lp=new LoginPage(driver);
		lp.Signin().click();
		lp.Email().sendKeys("sayan@gmail.com");
		lp.Password().sendKeys("123456");
		lp.Submit().click();
		
		
		}
	
	@AfterTest
	public void close() {
		driver.close();
		driver=null;
	}
}

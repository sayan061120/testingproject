package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
  
	public WebDriver initializerDriver() throws IOException {
Properties p =new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\E2E\\src\\test\\resources\\data.properties");
		
		p.load(fis);
		
		String browserName=p.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Office documents\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else {
			System.out.println("driver is not present");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}

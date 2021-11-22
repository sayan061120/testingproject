package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addto {
	WebDriver driver;

	public  Addto(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		By submit=By.xpath("//button[@name='add']");
		
		
		public WebElement Submit() {
			return driver.findElement(submit);
			
		
		}
		
		
}

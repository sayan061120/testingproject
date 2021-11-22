package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextObject {
	 WebDriver driver;

		public  TextObject(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		
		By check=By.xpath("//*[@id=\"shopify-section-1597748325424\"]/div/div/header/h2]");
	
		
	
	public WebElement Check() {
		
		return driver.findElement(check);
	}
}

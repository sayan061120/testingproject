package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Giftcardobject {
	WebDriver driver;

	public  Giftcardobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		By gift=By.linkText("gift card");
		By text=By.xpath("//h1[@class='h1 product-single__title']");
		
		public WebElement Gift() {
			return driver.findElement(gift);
			
		
		}
		public WebElement Text() {
			return driver.findElement(text);
			
		
		}
		
}

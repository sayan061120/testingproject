package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckObject {

	 WebDriver driver;

	public  CheckObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		By wishlist=By.linkText("wish list");
		By checklist=By.id("swym-plugin-name");
		
		public WebElement Wishlist() {
			return driver.findElement(wishlist);
			
		
		}
		public WebElement Checklist() {
			return driver.findElement(checklist);
			
		
		}
		
	}


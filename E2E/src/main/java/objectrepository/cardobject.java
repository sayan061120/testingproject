package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cardobject {
	WebDriver driver;

	public  cardobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By card=By.linkText("cart");
	
By check=By.xpath("//*[@id=\"CartDrawer\"]/form/div[1]");
	
public WebElement Card() {
		
		return driver.findElement(card);
	}
public WebElement Check() {
	
	return driver.findElement(check);
}
}

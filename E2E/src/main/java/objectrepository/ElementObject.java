package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementObject {
	WebDriver driver;

	public  ElementObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By lord=By.xpath("//div[@class='grid-product__content']");
	
By check=By.xpath("//*[@id=\"ProductSection-6585716277446\"]/div/div/div[1]/div[2]/div/div[1]/h1");
	
public WebElement Lord() {
		
		return driver.findElement(lord);
	}
public WebElement Check() {
	
	return driver.findElement(check);
}
}

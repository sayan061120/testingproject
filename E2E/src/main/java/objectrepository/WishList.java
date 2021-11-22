package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishList {
	WebDriver driver;

	public  WishList(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By homedecor=By.xpath("//button[@class='btn btn-default']");
	By bulb=By.xpath("//div[@class='grid-product__meta']");
	By add=By.xpath("//span[@class='swym-wishlist-cta']");
	
	public WebElement Homedecor() {
		return driver.findElement(homedecor);
		
	}
	public WebElement Bulb() {
		return driver.findElement(bulb);
		
	}
	public WebElement Add() {
		return driver.findElement(add);
		
	}
}

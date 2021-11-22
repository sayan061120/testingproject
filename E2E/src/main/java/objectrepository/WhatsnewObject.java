package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatsnewObject {
	 WebDriver driver;

		public  WhatsnewObject(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		By submit=By.xpath("//button[@class='btn btn-default']");
		By check=By.xpath("//div[@class='grid-product__title']");
	
		
	public WebElement Submit() {
			
			return driver.findElement(submit);
		}
	public WebElement Check() {
		
		return driver.findElement(check);
	}

}

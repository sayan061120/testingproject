package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {

	 WebDriver driver;

	public  SearchBar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By search=By.xpath("//input[@typ='search']");
	By submit=By.xpath("//div[@type='submit']");
	By check=By.xpath("//h1[@class='section-header__title']");
	public WebElement Search() {
		
		return driver.findElement(search);
	}
public WebElement Submit() {
		
		return driver.findElement(submit);
	}
public WebElement Check() {
	
	return driver.findElement(check);
}

}

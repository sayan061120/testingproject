package objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	

	 WebDriver driver;

	public  LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		By signin=By.linkText("sign in");
		By email=By.id("CustomerEmail");
		By password=By.id("CustomerPassword");
		By submit=By.xpath("//input[@value='Sign In']");
		public WebElement Signin() {
			return driver.findElement(signin);
			
		
		}
		public WebElement Email() {
			return driver.findElement(email);
			
		
		}
		public WebElement Password() {
			return driver.findElement(password);
			
		
		}
		public WebElement Submit() {
			return driver.findElement(submit);
			
		
		}
	}



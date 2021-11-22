package Academy;



import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;




import objectrepository.SearchBar;

public class Search extends TestBase  {
	
@Test
	
	public void SearchTest() throws IOException {
		
    driver=initializerDriver();
		
		driver.get("https://www.bigsmall.in/");
		
		SearchBar sb=new SearchBar(driver);
		sb.Search().sendKeys("key chain");
		sb.Submit().click();
		System.out.println(sb.Check().getText());
		
		
		
		
	}
@AfterTest
public void close() {
	driver.close();
	driver=null;
}

}

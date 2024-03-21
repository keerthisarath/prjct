
package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzn {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test()
	{
		driver.get(baseurl);
		//WebElement search=driver.findElement(By.name("q"));
		
		//search.sendKeys("books",Keys.ENTER);
		//search.submit();
		}
}





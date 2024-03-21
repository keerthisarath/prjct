package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;
import pagepkg.Fbloginpage;

public class Fbcreatetest {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
    	driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testsignup()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpage();
		ob.login();
		String actualtitle=ob.titleverification();
		Assert.assertEquals(actualtitle, "createpage");
		
		
	}

}

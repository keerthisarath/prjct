package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automtnexcrse {
	ChromeDriver driver;
    String baseurl="https://automationexercise.com/login";
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
    }
	
	@Test
	public void verifyurl()
	{
		String exp="https://automationexercise.com/";
		String actual=driver.getCurrentUrl();
		
		if(actual.equals(exp)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}

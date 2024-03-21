package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonnew {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in/";

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();	
	}

	@Test
	public void test() 
	{
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	    mobile.sendKeys("mobilephones");	
		mobile.submit();
		
		String exp="Amazon.in : mobilephones";
		String act=driver.getTitle();
		if(act.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
			
	
	}
	}



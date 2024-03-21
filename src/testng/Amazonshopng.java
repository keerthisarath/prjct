package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonshopng {
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
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
				//driver.close();
			}
			}
}
}

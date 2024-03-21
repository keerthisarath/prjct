package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		ChromeDriver driver;
		String baseurl="https://www.amazon.in/";
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			driver.manage().window().maximize();		}
		
		@Test
		public void instalogin() throws InterruptedException
		{
			Thread.sleep(3000);
			
		    WebElement mobile=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		    mobile.sendKeys("mobiles");	
			mobile.submit();
			//driver.findElement(By.xpath("//div[@id='navbar']/div[4]/div[2]/div/div/a[1]")).click();
	        driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[4]")).click();
			//driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]")).click();
			driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
			driver.navigate().back();
			driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
			driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/i")).click();
		
			
			
			
			}
}

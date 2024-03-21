package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	
	
		 
		ChromeDriver driver;
		String baseurl="https://janasya.com/";
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void linkcount() 
		{
			
			String exptitle="Janasya";
			String actualtitle=driver.getTitle();
			if(actualtitle==exptitle)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li/a/span")).click();
		   driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
			
			driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
			WebElement kurta=driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
			
		    kurta.sendKeys("dresses");	
			kurta.submit(); 
			    
			
}
}

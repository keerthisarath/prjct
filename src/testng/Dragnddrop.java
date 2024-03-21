package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragnddrop {
	ChromeDriver driver;
    String baseurl="https://demo.guru99.com/test/drag_drop.html";
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
    }
	
	@Test
	public void dragndropmethod()
	{
		WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement Account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement Cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement Account1=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement Cash1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Amount1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Bank, Account);	
		act.dragAndDrop(Cash, Amount);	
        act.dragAndDrop(Sales, Account1);	
		act.dragAndDrop(Cash1, Amount1);	
		act.perform();
	}
	
	@Test
	public void button()
	{
		
		boolean button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
	
		if(button)
		
		{
			System.out.println("perfect button is displayed");
		}
		else
		{
			System.out.println("Not displayed");
		}
	}

}

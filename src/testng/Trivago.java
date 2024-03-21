package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	ChromeDriver driver;
    String baseurl="https://www.trivago.in/";
    
	@BeforeTest
	public void urlopen()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]")).click();
	    while(true)
	    {
	    	WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
	    	String monthtext=month.getText();
	    	System.out.println(monthtext);
	    	if(monthtext.equals("June 2024")) {
	    		break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
	        }
	    	
	    }
	    List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button"));
	    for(WebElement ele:li)
	    {
	    	String date=ele.getText();
	    	if(date.equals("20"))
	    	{
	    		ele.click();
	    	}
	    }
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
	}





}

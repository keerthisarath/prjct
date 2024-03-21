package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehvr {
	
	ChromeDriver driver;
    String baseurl="https://www.ebay.com/";
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
    }
	@Test
	public void ebay()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		//driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		//*[@id="vl-flyout-nav"]/ul/li[4]/a
	}

}

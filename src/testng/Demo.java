package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver;
    String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
    }
	@Test
	public void demo()
	{
		
		
		Actions act=new Actions(driver);
		WebElement rclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rclick).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		
		
		
	    WebElement dclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dclick).perform();
        Alert a=driver.switchTo().alert();
		System.out.println("alerttext="+a.getText());
		a.accept();

	}
	

}

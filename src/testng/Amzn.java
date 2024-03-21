package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amzn {
	ChromeDriver driver;
    String baseurl="https://www.amazon.in/";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	Dimension d = new Dimension (1200,1080);
 	
 	   driver.manage().window().setSize(d);
	
}
@Test
public void amznnew() throws Exception
{
    Thread.sleep(7000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Scroll down till the bottom of the page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
	//driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[8]/a")).click();


}
}

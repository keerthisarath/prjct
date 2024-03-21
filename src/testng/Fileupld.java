package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupld {
	
	ChromeDriver driver;
    String baseurl="https://demo.guru99.com/test/upload/";
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
    }
	@Test
	public void demo()
	{
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		fileupload.sendKeys("E:\\my documents\\new sign");
		driver.findElement(By.id("terms")).click();
	}

}

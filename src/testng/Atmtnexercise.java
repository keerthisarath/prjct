package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Atmtnexercise {
	ChromeDriver driver;
    
    
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	
    }
	
	@Test
	public void signup()
	{
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("name")).sendKeys("Keerthi Sarath");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("keerthimohanj1994@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		
				;
				driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("km123456");
				WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
				Select daydetails=new Select(day);
				daydetails.selectByValue("1");
				WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
				Select monthdetails=new Select(month);
				monthdetails.selectByValue("1");
				WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
				Select yeardetails=new Select(year);
				yeardetails.selectByValue("1994");
				
				driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("keerthi ");
				driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("mohan ");
				driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("abc");
				driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("gouri bhavan");
				driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("sdbgra");
				WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
				Select countrydetails=new Select(country);
				countrydetails.selectByValue("India");
				driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
				driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Tvm");
				driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("695019");
				driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("908786842");
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
				
				

			
			}
		
		
	}

	



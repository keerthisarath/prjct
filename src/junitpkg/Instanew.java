

package junitpkg;


	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

   
	public class Instanew {
		ChromeDriver driver;
		String baseurl="https://www.instagram.com/";
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void fblogin() throws InterruptedException
		{
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");	
			//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("12345");
			
			//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
	}
	}






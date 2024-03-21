package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {
	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void logodisplay()
	{
        boolean logo=driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
        if(logo)
        {
        	System.out.println("Logo id displayed");
        }
        else
        {
        	System.out.println("Logo not displayed");
        }
       boolean radio= driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isDisplayed();
     
       if(radio)
	   {
		   System.out.println("Male radio Button is selected");
	   }
	   else
	   {
		   System.out.println("Button not selected");
	   }
	}
       
       

}

package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	
WebDriver driver;

	By fbcreatepg=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbcreatepage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createpage() {
		driver.findElement(fbcreatepg).click();
	}
	
	public void login()
	{
		driver.findElement(fbsignup).click();
	}
	
	public String titleverification() {
		String title=driver.getTitle();
		return title;
	}
}

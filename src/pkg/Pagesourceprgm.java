package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurl="https://google.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("gmail text is present");
		}
		else
		{
			System.out.println("Gmail text not present");
		}
		driver.quit();
	}

}

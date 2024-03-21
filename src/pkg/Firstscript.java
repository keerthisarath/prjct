package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver(); //to launch chrome browser
		driver.get("https://google.com");	//to load url
		String act=driver.getTitle();
		String exp="Google";
		//System.out.println(exp.equals(act));
		
	if(exp.equals(act))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.quit();
	}

}

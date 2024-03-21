package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
   
    @BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
    }
	
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com/");
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Dreams\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+pswrd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pswrd);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
			
		}
	}
	
	

}

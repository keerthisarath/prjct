package testng;


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Rediffnew {
		
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	    ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
	    }
		@BeforeMethod
		public void loading()
		{
			driver.get(baseurl);
		}
		@Test(groups={"smoke"})
		public void titleverification()
		{
			String exp="Rediffmail";
			String actualtitle=driver.getTitle();
			if(actualtitle.equals(exp))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		@Test(groups= {"smoke","sanity"})
		public void logodisplay()
		{
	        boolean logo=driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	        if(logo)
	        {
	        	System.out.println("Logo is displayed");
	        }
	        else
	        {
	        	System.out.println("Logo is not displayed");
	        }
		}
		
		@Test(groups= {"regression"})
	       public void contentverification()
	       {
	    	   String src=driver.getPageSource();
	    	   if(src.contains("Full Name")) 
	    	   {
	    		   System.out.println("full name label is present");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("not present");
	    	   }
	       }
		@Test
		public void buttontextverification()
		{
			String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
			if(buttontext.equals("Create my account"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
					
		}
		
		@Test
		public void createaccenable()
		{
	        boolean createacc=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
	        if(createacc)
	        {
	        	System.out.println("Button id enabled");
	        }
	        else
	        {
	        	System.out.println("Button not  displayed");
	        }
		}
}

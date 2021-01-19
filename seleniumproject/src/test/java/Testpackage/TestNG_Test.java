package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.remote.RemoteTestNG;
import pages.SearchObject;

public class TestNG_Test {
	private static WebDriver driver = null;
	
	@BeforeTest
	public static void Start ()
{
	String projectpath= System.getProperty("user.dir");
	System.out.println(projectpath);
	System.setProperty("webdriver.chrome.driver",projectpath+"/Driver/chromedriver/chromedriver.exe");
	 driver= new ChromeDriver();
}
	@Test
	
public void googleSearchTest()
{
	 SearchObject pageObj = new SearchObject(driver);
	 driver.get("https://google.com/");
	 
	 pageObj.text("Capital of India");
	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 pageObj.click();
	 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 
}
	
	@AfterTest
	public static void EndTest()
	{
		 driver.close();
		}
}

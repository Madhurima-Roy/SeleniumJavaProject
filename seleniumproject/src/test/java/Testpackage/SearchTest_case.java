package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SearchObject;

public class SearchTest_case {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();

	}
public static void googleSearchTest()
{
	String projectpath= System.getProperty("user.dir");
	System.out.println(projectpath);
	System.setProperty("webdriver.chrome.driver",projectpath+"/Driver/chromedriver/chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 SearchObject pageObj = new SearchObject(driver);
	 driver.get("https://google.com/");
	 
	 pageObj.text("Capital of India");
	 /*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	 pageObj.click();
	 
	 /*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	 driver.close();
	 
}
}

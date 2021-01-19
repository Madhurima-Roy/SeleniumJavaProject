package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) {
				
			googleSearch();
		
	}
	
	public static void googleSearch(){
		
		String projectpath= System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/Driver/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Goto Google
		driver.get("https://google.com/");
		
		
		//Enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Capital of India");
		
		//Click on search button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//Close search
		driver.close();
		
		System.out.println("Test run successfully");
	}
	
		
}

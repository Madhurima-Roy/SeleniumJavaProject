package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args)
	{
		String projectpath= System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/Driver/chromedriver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Capital of India");
		List<WebElement> list= driver.findElements(By.xpath("//input"));
		int count = list.size();
		System.out.println("count is : "+count);
		
		//WebElement testbox = driver.findElement(By.name("q"));
		//testbox.sendKeys("capital of India");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
		
	}

}

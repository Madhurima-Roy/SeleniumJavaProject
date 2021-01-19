package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	static WebElement element = null;
	public static WebElement box(WebDriver driver){
	  element = driver.findElement(By.name("q"));
		return element;
			
	}
public static WebElement button(WebDriver driver)
{
	element = driver.findElement(By.name("q"));
	return element;
}
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchObject {

	WebDriver driver = null;
	
	By searchbox = By.name("q");
	By search_button = By.name("q");
	
	public SearchObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void text (String text){
		driver.findElement(searchbox).sendKeys(text);
	}

	public void click()
	{
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
}

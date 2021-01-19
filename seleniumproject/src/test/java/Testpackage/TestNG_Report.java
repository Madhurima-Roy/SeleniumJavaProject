package Testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

import java.io.IOException;

public class TestNG_Report { 
	static WebDriver driver;
	ExtentSparkReporter spark;
	static ExtentTest test;	
	ExtentReports extent;
@BeforeSuite	
public void start(){
	
	 extent = new ExtentReports();
	 spark = new ExtentSparkReporter("extent report.html");
	extent.attachReporter(spark);
}
@BeforeTest
public static void StartTest ()
{
String projectpath= System.getProperty("user.dir");
System.out.println(projectpath);
System.setProperty("webdriver.chrome.driver",projectpath+"/Driver/chromedriver/chromedriver.exe");
 driver= new ChromeDriver();
}


@Test
public void TestBody1() throws Exception
{
	 test = extent.createTest("My First Google Search Test");
	 test.log(Status.INFO, "Test started");
	 driver.get("https://google.com/");
	  test.pass("Goto Google Search");
	  
	 driver.findElement(By.name("q")).sendKeys("Capital of India");
	 test.pass("Searched the content");
	 
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 test.pass("pressed the enter key");
	 
}
@Test
public void TestBody2() throws Exception
{
	 test = extent.createTest("My Second Google Search Test");
	 test.log(Status.INFO, "Test started");
	 driver.get("https://google.com/");
	  test.pass("Goto Google Search");
	  
	 driver.findElement(By.name("q")).sendKeys("Capital of West Bengal");
	 test.fail("Searched the content");

	 
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 test.pass("pressed the enter key");
	 
}

@AfterTest
public static void EndTest()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.close();
	 driver.quit();
	 test.pass("Closed the page");
	 
	 test.info("Test got completed");
}


@AfterSuite
public void End()
{
	extent.flush();
}

	
}	


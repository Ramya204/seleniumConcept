package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeMethod
	public void startTime() {
		System.out.println("Strat time");
	}
	@AfterMethod
	public void endTime() {
		System.out.println("End time");
	}
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Launch browser");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	
	/*@Test(priority=-10)
	public void test1() {
		// TODO Auto-generated method stub
	System.out.println("Test1");
	}
	@Test(priority=5)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(enabled=false)
	public void test3() {
		System.out.println("Test3");
	}
	*/
	
	
	/*	@Test(invocationCount=3)//invocation count
	public void test4() {
		System.out.println("Test4");
	}*/
	
	/*@Parameters({"username","password"})//pass argument from xml
	//@Parameters({"Username","password"})//@optional
	@Test
	public void test1(@Optional("butterfly")String un,String ps) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramya\\TestNG1\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(ps);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}*/
	
	
/*	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramya\\TestNG1\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
	
	
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramya\\TestNG1\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("username1");
		driver.findElement(By.id("pass")).sendKeys("password1");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}*/
}

package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnotherClass {
	@Test(dataProvider="datas",dataProviderClass=DataProvider1.class)
	public void test1(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramya\\TestNG1\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
}

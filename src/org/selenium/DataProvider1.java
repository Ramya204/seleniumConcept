package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name="datas")
	public Object[][] data(){
		return new Object[][] {{"123","234"},{"345","456"},{"789","890"}};
		
	}
	@Test(dataProvider="datas")
	//public void test1(String s1,String s2) {
	public void test1(String[] s1) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ramya\\TestNG1\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
/*		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);*/
		//to avoid multiple arguments pass
		driver.findElement(By.id("email")).sendKeys(s1[0]);
		driver.findElement(By.id("pass")).sendKeys(s1[1]);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
}

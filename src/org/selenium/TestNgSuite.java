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

public class TestNgSuite {
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
	@Test(groups="sanity")
	public void test1() {
		// TODO Auto-generated method stub
	System.out.println("Test1");
	}
	@Test(groups= {"sanity","unit","reg"})
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups="unit")
	public void test3() {
		System.out.println("Test3");
	}
	

}

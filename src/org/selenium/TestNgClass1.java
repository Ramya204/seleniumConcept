package org.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass1 {
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
	@Test(dependsOnMethods="test2")
	public void test1() {
		// TODO Auto-generated method stub
	System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@Test
	public void test3() {
		System.out.println("Test3");
	}
}

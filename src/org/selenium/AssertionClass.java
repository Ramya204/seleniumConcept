package org.selenium;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionClass {

	//@Test(retryAnalyzer=Failed.class)
	@Test
	public void test1() {
	Assert.assertTrue(true);
	Assert.assertTrue(false);
	Assert.assertTrue(true);
	System.out.println("Test1");
	}
	@Test
	public void test2() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("Test2");
	}
	@Test
	public void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("Test3");
	}
}

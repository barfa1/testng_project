package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass {

	@BeforeTest(alwaysRun = true)
	public void BeforeTestMethod() {
		System.out.println("Inside BEFORE TEST");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
		System.out.println("Inside Setup");
	}
	@BeforeClass(alwaysRun = true)
	public void BeforeClassMethod() {
		System.out.println("Inside BEFORE CLASS METHOD ");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		System.out.println("Inside Teardown");
	}
	@AfterTest(alwaysRun = true)
	public void AfterTestMethod() {
		System.out.println("Inside AFTER TEST");
	}
	
	@AfterClass(alwaysRun = true)
	public void AfterClassMethod() {
		System.out.println("Inside AFTER CLASS METHOD ");
	}
	
	
}

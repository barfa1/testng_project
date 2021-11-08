package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
public class BaseClass {
	public static WebDriver driver;
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void ReportSetup() {
		report = new ExtentReports("ExtentReport.html");
		
	}
	
	@BeforeMethod
	public void setup() {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "geckodriver");
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				driver = new ChromeDriver();
				driver.get("https://www.simplilearn.com/");
//				managing window size 
				driver.manage().window().maximize();
	}
	@AfterMethod
	public  void teardown(){
	
		driver.close();
		driver.quit();

	}
	
	@AfterTest
	public void ReportTeardown() {
		report.flush();
		report.close();
	}
}

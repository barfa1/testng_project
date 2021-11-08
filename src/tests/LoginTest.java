package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	@Parameters({"UserName","Password"})
	public void PositiveLogin(String correctUser, String correctPass) {
		test = report.startTest("Positive Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(correctUser,correctPass);
		report.endTest(test);
	}
	@Test
	@Parameters({"wrongUser","Password"})
	public void NegativeLogin(String wrongUser, String wrongPass) {
		test = report.startTest("Negative Login Test");
		LoginPage loginPage = new LoginPage();
		loginPage.Login(wrongUser,wrongPass);
		loginPage.Errorcheck();
		report.endTest(test);
	}
	
}

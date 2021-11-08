package test;

import org.testng.annotations.Test;

public class Testcase2 extends BaseClass {
	

	
	@Test(enabled=true,description="Credit card   testcase")
	public void CreditcardTest() {
		System.out.println("Inside creditcard ");
	}
	@Test(groups= {"sanity"},dependsOnMethods="ThirdTest")
	public void SecondTest() {
		System.out.println("Inside secondtest ");
	}
	@Test(groups= {"sanity"})
	public void ThirdTest() {
		System.out.println("Inside thirdtest ");
	}
	
	
}

package test;

import org.testng.annotations.Test;

public class Testcase1 extends BaseClass {
	
	@Test(priority=2)
	public void  HomeLoan() {
		System.out.println("inside homeloan0 ");
	}
	@Test(priority=1)
	public void  HomeLoan1() {
		System.out.println("inside homeloan1 ");
	}
	@Test(priority=0)
	public void  HomeLoan2() {
		System.out.println("inside homeloan2 ");
	}
	@Test(groups= {"sanity"})
	public void  CarLoan() {
		System.out.println("inside Carloan  ");
	}

}

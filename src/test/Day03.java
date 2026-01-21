package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day03 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I will execute before the class in Day03 - Before class annotation");
	}
	
	
	@AfterClass
	public void afterclass() {	
		System.out.println("I will execute after the class in Day03 - After class annotation");
	}
	
	
	@Test
	public void WebloginCarLoan() {
		System.out.println("Web Login Car Loan");
	}
	
	@Test
	public void MobileloginCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}
	
	
	@BeforeMethod
	public void beforeeverymethod() {
		System.out.println("I will execute before every method in Day03 class");
	}
	
	
	
	@AfterMethod
	public void Aftereverymethod() {
		System.out.println("I will execute after every method in Day03 class");
	}
	@Test(groups= {"Smoke"})
	public void MobileleSignInCarLoan() {
		System.out.println("Mobile SignIn Car Loan");
	}
	
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	
	@Test
	public void MobilelSignOutCarLoan() {
		System.out.println("Mobile SignOut Car Loan");
	}
	
	@Test
	public void APICarLoan() {
		System.out.println("API Login Car Loan");
	}
}

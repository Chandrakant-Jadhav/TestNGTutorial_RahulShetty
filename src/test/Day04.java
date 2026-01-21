package test;

import org.testng.annotations.Test;

public class Day04 {
	@Test
	public void WebloginHomeLoan() {
		System.out.println("Web Login Home Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan() {
		System.out.println("Mobile Login Home Loan");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("API Login Home Loan");
	} 
	
}

package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day04 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname) {
		System.out.println("Web Login Home personal Loan");
		System.out.println(urlname);
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

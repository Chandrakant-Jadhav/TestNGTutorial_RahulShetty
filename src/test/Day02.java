package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day02 {

	@Test(groups= {"Smoke"})
	public void Ploan() {
		System.out.println("Personal Loan data");
	}

	@BeforeTest
	public void prerequiste() {

		System.out.println("I will execute before all the tests in xml file");
	}
}

package test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day01 {

	@AfterTest
	public void Demo() {
		System.out.println("I will execurte last in Day01 class");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Second Test Case");
		Assert.assertTrue(false);
   }
	
	@AfterSuite
	public void Afsuite() {
		System.out.println("I am the no 1 from last");
	}
}
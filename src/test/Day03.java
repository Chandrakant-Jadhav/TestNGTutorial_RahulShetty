package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
	
	
	@Test(enabled=false)
	public void WebloginCarLoan() {
		System.out.println("Web Login Car Loan - Disabled Test Case");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void MobileloginCarLoan(String urlname, String key) {
		System.out.println("Mobile Login Car Loan");
		System.out.println(urlname);
		System.out.println(key);
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
	
	
	@Test(timeOut=4000)
	public void MobilelSignOutCarLoantimeOut() {
		System.out.println("Mobile SignOut Car Loan");
	}
	
	@Test(dataProvider="getData")
	public void MobilelSignOutCarLoan(String username, String password) {
		System.out.println("Mobile SignOut Car Loan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"MobileloginCarLoan"})
	public void APICarLoan() {
		System.out.println("API Login Car Loan");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username and password - good credit history
		//2nd - username and password - no credit history
		//3rd - fraudelent credit history
		Object [][]data =new Object[3][2];
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		
		//2nd set
		//column in the row is nothing but values for that particular combination
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
}

package javaTopics;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Ps {
	
	public void doThis() {
		System.out.println("Doing this");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I will execute before every method in Ps1 class");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("I will execute After all method in Ps1 class");
	}

}

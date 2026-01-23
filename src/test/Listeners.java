package test;
//Itestng Listeners: Used to listen the events that are happening in the test cases and take action accordingly

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("I successfully exceuted the test case");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code can be written here
		System.out.println("Test failed: " + result.getName());
		System.out.println("I failed this listeners test case");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
	}


}

package javaTopics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ps1 extends Ps {

	
	@Test
		public void FirstTest() {
		
		Ps2 ps2=new Ps2();
		
		
		int a=3;	
		doThis();
		
		System.out.println(ps2.increment());
	}

}

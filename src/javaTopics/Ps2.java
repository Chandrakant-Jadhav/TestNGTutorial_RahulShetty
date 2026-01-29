package javaTopics;

public class Ps2 extends Ps3{
	int a;//class variable
	
	public Ps2(int a) {
		super(a); //calling parent class constructor
		this.a=a;//local variable---> assigning to class variable --> this.a
		//This keyword refers to the current class variable
		
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decrement()
	{
		a=a-1;
		return a;
	}

}

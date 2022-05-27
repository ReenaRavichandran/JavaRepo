package com.java.pratice;

public class AnotherChild extends Parent{

	
	private void subMethod4() {
		System.out.println("another child class");
	}
	
	public static void main(String[] args) {
		
		AnotherChild a = new AnotherChild();
		a.subMethod();
		a.subMethod2();
		
		a.subMethod4();
		
		
		
	}
	
}

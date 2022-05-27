package com.java.pratice;

public class Child extends Parent{

	private void subMethod3() {
		System.out.println(" child class 1");
	}
	
	
	public static void main(String[] args) {
		
		Child a = new Child();
		a.subMethod();
		a.subMethod2();
		a.subMethod3();
		
		
		
	}
	
	
}

package com.java.concept;

public class StaticKeyword {
	static int a= 89;
	public static void subMethod() {
		System.out.println("static method");
	}
	protected static void subMethod(int a) {

	}
	static void subMethod(String c ) {

	}
	
	public static void main(String[] args) {
		
		subMethod();
		subMethod(89);
		subMethod("reena");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

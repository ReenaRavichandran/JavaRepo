package com.java.concept;

public class AccessSpecifiers {

	
	private void privateSubMethod() {
		System.out.println("i am private sub method ");
	}
	
	public static void main(String[] args) {
		
		 AccessSpecifiers a = new  AccessSpecifiers();
		 a.privateSubMethod();
		 a.publicSubMethod();
		 a.protectedSubMethod();
		 a.defaultSubMethod();
		 
	}
	public void publicSubMethod() {
		System.out.println(" i am public sub method ");
	}
	
	protected void protectedSubMethod() {
		System.out.println("i am protected sub method");
	}
	
	 void defaultSubMethod() {
		System.out.println("i am default sub method");
	}
	 
	 
	 
}

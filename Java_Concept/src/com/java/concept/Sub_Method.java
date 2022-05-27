package com.java.concept;

public class Sub_Method {

	private void subMethod() {
		System.out.println("i am sub method one");
		
	}

	private void subMethod2() {
		System.out.println("i am sub method two ");
	}

	public static void main(String[] args) {
		// classname object ref = new classname();

		Sub_Method objectRef = new Sub_Method();
		// to call method object ref name.methodname();

		objectRef.subMethod2();
		objectRef.subMethod();

	}

}

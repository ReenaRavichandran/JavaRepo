package com.java.concept;

public class Variables {
	int a = 34;
	String c = "java"; // initialization 
	int d ; // declare
	String e;
	static int q= 67;
	static int w;
	static String t ="python";
	static String y ;
	private void submethod() {
		int a = 23; // datatype variable name = variable value;//initialization
		System.out.println(a);
	}
	private void submethod2() {
		System.out.println(q);
		System.out.println(a);
	}
	private void submethod3() {
		a = 88;
		
		System.out.println(a);
		System.out.println(e);
	
	}
	private static void subMethod4() {
		System.out.println(y);
		int o = 56;
		System.out.println(o);
	
	}
	private void submethod5() {
		System.out.println(t);
	}
	public static void main(String[] args) {
		Variables a = new Variables();
		a.submethod(); // local
		a.submethod2();
		a.submethod3();
		System.out.println(a.d); // object.variablename 
		System.out.println(a.c);
		System.out.println(w); // static variable 
		subMethod4(); // static method
		a.submethod5();
		
		
	}
	
	
	
	

}

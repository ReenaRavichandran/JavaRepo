package com.java.pratice;

public class Variabless {
	static int b = 89;
	
	int a;
	private  void subMethod1() {
		
		System.out.println(a);
		a=77;
	}
	private static void subMethod() {
		  int c =98;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		subMethod();
		Variabless a = new Variabless();
		a.subMethod1();
		System.out.println(a.a);
		System.out.println(b);
	}
	
}

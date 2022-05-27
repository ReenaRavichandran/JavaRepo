package com.java.concept;

public class Dynamic_Binding extends Static_Binding {

	@Override
	public void subMethod1() {
		super.subMethod1();
		System.out.println(" override sub method");
	}

	@Override
	public void subMethod1(int a) {
		super.subMethod1(a);
		System.out.println("over ridesub method " + a);
	}

	@Override
	public void subMethod1(int b, String c) {
		super.subMethod1(b, c);
		System.out.println("over ride sub method " + b + " " + c);
	}

	public static void main(String[] args) {

//		Dynamic_Binding a = new Dynamic_Binding();
//
//		a.subMethod1();
//		a.subMethod1(67);
//		a.subMethod1(77, "python");
		
//		Dynamic_Binding a = new Static_Binding();
		
		

	}

}

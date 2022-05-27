package com.java.pratice;

public class Static_Binding {

	public void subMethod() {
		System.out.println("method");
	}

	public void subMethod(int a) {
		System.out.println("method " +a);
	}

	public void subMethod(String b) {
		System.out.println("method "+b);
	}

	public static void main(String[] args) {
//
//		Static_Binding a = new Static_Binding();
//
//		a.subMethod();
//		a.subMethod(89);
//		a.subMethod("java");
		
		Static_Binding a  = new  DynamicBinding();
		a.subMethod();
		a.subMethod(199);
		a.subMethod("hello");
	}

}

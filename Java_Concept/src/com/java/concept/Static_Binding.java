package com.java.concept;

public class Static_Binding {

	public void subMethod1(int a) {
		System.out.println(" i am sub method " +a);
	}

	public void subMethod1(int b, String c) {
		System.out.println(" i am sub method "+b + " "+c);
	}

	public void subMethod1() {
		System.out.println(" i am sub method ");
	}

	public static void main(String[] args) {
//		Static_Binding a = new Static_Binding();
//		a.subMethod1();
//		a.subMethod1(89);
//		a.subMethod1(90, "java");
		//parent                  // child 
		Static_Binding a = new Dynamic_Binding();
		a.subMethod1();
		a.subMethod1(89);
		a.subMethod1(99, "hello world");
	}
}

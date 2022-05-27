package com.java.concept;

public class SubThis {

	public  void subMethod() {
		this.subMethod1();
		System.out.println("this is submethod ");
	}
	
	private void subMethod1() {
		this.subMethod2();
		System.out.println("this is submethod 1 ");
	}
	private void subMethod2() {
		System.out.println("this is submethod  2");
	}
	
	public static void main(String[] args) {
		SubThis a = new SubThis();
		a.subMethod();
	}
	
	
}

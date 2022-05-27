package com.java.concept;

public class SubSuper extends SubThis {
	private void subMethod3() {
		this.subMethod4();
		System.out.println("this is submethod 3");
	}
	private void subMethod4() {
		this.subMethod5();
		System.out.println("this is submethod  4");
	}
	private void subMethod5() {
		super.subMethod();
		System.out.println("this is submethod  5");
	}
	
	public static void main(String[] args) {
		SubSuper a = new  SubSuper();
		a.subMethod3();
	}
}

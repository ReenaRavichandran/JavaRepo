package com.java.concept;

public class ReturnType {

	int r = 78;
	private int subMethod() {
		int a = 45;
		return a;
	}
	int c = subMethod();
	private void subMethod1() {

		System.out.println(c);
	}

	public static void main(String[] args) {

		ReturnType a = new ReturnType();
		a.subMethod1();
		System.out.println(a.subMethod());
		System.out.println(a.r);
		System.out.println(a.c);
	}

}

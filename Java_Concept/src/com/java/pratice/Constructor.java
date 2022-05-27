package com.java.pratice;

public class Constructor {
	
	public Constructor() {
		this(90);
		System.out.println("constructor");
	}
	public Constructor(int a) {
		
		System.out.println("constructor "+a);
	}
	private void constructor() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		Constructor a = new Constructor();
		a.constructor();
		
		
	}
}

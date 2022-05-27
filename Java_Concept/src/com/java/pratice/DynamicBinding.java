package com.java.pratice;

public class DynamicBinding extends Static_Binding{
	
	@Override
	public void subMethod() {
		super.subMethod();
		System.out.println("override");
	}
	@Override
	public void subMethod(int a) {
		super.subMethod(a);
		System.out.println("override "+a);
	}
	@Override
	public void subMethod(String b) {
		super.subMethod(b);
		System.out.println("override "+b);
	}
	
	public static void main(String[] args) {
		DynamicBinding a = new  DynamicBinding();
		a.subMethod();
		a.subMethod(99);
		a.subMethod("python");
		
	}
	
	
}

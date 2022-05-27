package com.java.pratice;

public class KeywordSuper extends KeywordThis{

	private void subMethod4() {
		this.subMethod5();
		System.out.println(" i am submethod 4");
	}
	
	private void subMethod5() {
		this.subMethod6();
		System.out.println(" i am submethod 5");
	}
	private void subMethod6() {
		super.subMethod();
		System.out.println(" i am submethod 6");
	}
	
	public static void main(String[] args) {
		KeywordSuper s = new KeywordSuper();
		s.subMethod4();
	}
	
	
	
	
	
}

package com.java.pratice;

public class NonPrimitiveString {
	public static void main(String[] args) {
		String s = "java";
		StringBuffer a = new StringBuffer("java");
		StringBuffer b = new StringBuffer("java");
		
		int c = a.hashCode();
		int d = b.hashCode();
		
		System.out.println(a + " "+ c);
		System.out.println(b + " "+ d);
		
		a.append(b);
		int e = a.hashCode();
		System.out.println(a + " "+ e);
		
		
	}
}

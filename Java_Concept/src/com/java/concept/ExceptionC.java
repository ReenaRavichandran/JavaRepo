package com.java.concept;

import java.util.Scanner;

public class ExceptionC {
	
	private static void subMethod() {
		int a = 11;
		
		int b = 22;
		
		System.out.println(a+b);
		
		String c = "11 one";
		
		String d = "22";
		
		try {		
			int e = Integer.parseInt(c);		
			System.out.println(a+e);
			
		} catch (ArithmeticException e) {
			System.out.println("exception caught");
		}catch(Exception e) {
			System.out.println("exception 2 ");
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println(c+d);
	}
public static void main(String[] args) {
	
	subMethod();
	
	
	
}
}

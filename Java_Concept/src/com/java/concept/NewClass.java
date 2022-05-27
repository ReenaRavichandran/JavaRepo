package com.java.concept;

public class NewClass {
	
	
	private static void subMethod() throws Throwable {
		
		int a = 16; 
		int b =18;
		
		try {
			if(a>b) {
				System.out.println("true");
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("exception caught");
		}finally {
			System.out.println("done ");
		}
		
		
	}
	public static void main(String[] args) throws Throwable {
		
		subMethod();
	}
}

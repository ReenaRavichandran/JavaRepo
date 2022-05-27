package com.java.pratice;

public class NonPrimitive {
	
	public static void main(String[] args) {
		
		int a[] = new int[7];
		int b = a.length;
		System.out.println(b);
		
		a[0] = 45;
		a[2] = 67;
		a[3] = 66;
		a[4] = 22;
		a[6] = 90;
		
		
		System.out.println(a[1]);
		System.out.println(a[3]);
		
		for (int i = 0; i <b; i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}

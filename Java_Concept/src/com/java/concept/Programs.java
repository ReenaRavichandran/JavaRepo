package com.java.concept;

public class Programs {
	public static void main(String[] args) {
		int num = 54321;
		int j = 0;
		int a = num;  // 1+2+3+4 = 10  // 1234 // 123 // 12 // 1

		while (a > 0) {   // 1234 >0 123>0 12>0  1>0 0.1false 
		int	i = a % 10;  // 1234%10 // 4  123 3  2  1
			j = i + j;  // 4+0  4  4+3 =7  7+2 9  10
			a = a / 10; // 1234/10 = 123  // 12  1  0.1
		}
		System.out.println(j);
		
		
	}
}

package com.java.concept;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" enter the string :");
		String b =s.nextLine();
		System.out.println(" the entered string value :"+b);
		System.out.println(" enter the number :");
		int a = s.nextInt();
		System.out.println(" the entered number is :"+a);
		System.out.print(" enter the string value :");
		String r = s.next();
		System.out.println(" the entered string value is :" + r);
	
	}

}

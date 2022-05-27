package com.java.concept;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the switch to be executed ");
		int a = s.nextInt();

		switch (a) {
		case 1:	
			System.out.println("fan ");
			break;
		case 2:
			System.out.println("light");
			break;
		case 3:
			System.out.println(" ac");
			break;
		case 4:
			System.out.println("tv");
			break;

		default:
			System.out.println(" wrong input");
			break;
		}

	}
}

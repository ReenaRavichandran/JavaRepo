package com.java.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevisionClassA {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {
			int count = 0;

			for (int i = 2; i <= j/2; i++) {

				if (j % i == 0) {

					count++;

				}

			}
			if (count == 0) {
				System.out.println("prime number : " + j);
			}

		}
	}
}

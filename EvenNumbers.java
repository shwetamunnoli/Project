package com.kn.forloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		printEvenNumber(num);

	}

	private static void printEvenNumber(int num) {

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}

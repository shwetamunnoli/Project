package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for reverse = ");
		int num = scan.nextInt();
		int r = 0;
		reverseNumber(num, r);

	}

	private static void reverseNumber(int num, int r) {
		for (int i = 0; num > 0; i++) {
			r = num % 10;
			System.out.print(r);
			num = num / 10;
		}

	}

}

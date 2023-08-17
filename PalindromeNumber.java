package com.kn.forloop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = scan.nextInt();
		int sum = 0;
		int temp = 0;
		int r = 0;
		boolean palin = PalindromeNumber(num, r, sum, temp);
		System.out.println(palin);
	}

	private static boolean PalindromeNumber(int num, int r, int sum, int temp) {
		for (int i = 1; i < 0; i++) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

}

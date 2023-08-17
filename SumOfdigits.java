package com.kn.forloop;

import java.util.Scanner;

public class SumOfdigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = s.nextInt();
		int sum = sumofDigits(num);
		System.out.println(sum);
	}

	private static int sumofDigits(int num) {
		int r = 0, sum = 0;
		for (; num > 0;) {

			r = num % 10;
			sum = r + sum;
			num = num / 10;
		}

		return sum;
	}

}

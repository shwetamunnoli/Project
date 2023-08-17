package com.kn.forloop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the natural numbers = ");
		int num = scan.nextInt();
		int r, sum = 0;
		for (int i = num; i > 0; i++) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println(sum);
	}
}

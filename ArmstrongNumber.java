package com.kn.forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ending Armstrong number = ");
		int num = s.nextInt();

		printArmstrongNumber(num);

	}

	private static void printArmstrongNumber(int num) {
		int r = 0, sum = 0;
		for (int j = 1; j <= num; j++) {

			for (int i = 1; i <= j; i++) {
				r = num % 10;
				r = r * r * r;
				num = num / 10;
			}

			System.out.println(j);
		}

	}

}

package com.kn.forloop;

import java.util.Scanner;

public class CalculatePower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a base number = ");
		System.out.println("Enter a exponent number = ");
		int base = scan.nextInt();
		int exp = scan.nextInt();
		int power = CalculatePower(base, exp);
		System.out.println("power = " + power);
	}

	private static int CalculatePower(int base, int exp) {

		int power = 1;
		for (int i = 1; i <= exp; i++)
			;

		power = power * base;

		return power;
	}
}

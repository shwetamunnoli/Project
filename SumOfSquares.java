package com.kn.forloop;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		int square = sumOfSquares(num);
		System.out.println(square);
	}

	private static int sumOfSquares(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + (i * i);
		}
		return sum;
	}

}

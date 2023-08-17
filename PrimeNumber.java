package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		PrimeNumber(num);
		
	}

	public static void PrimeNumber(int num) {

		for (int j = 1; j <= num; j++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (j % i == 0) {

					count++;
					
				}
			}
			if (count == 2) {
				System.out.println(j + " ");
			}

		}

	}

}

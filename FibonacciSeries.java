package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstnum = 0;
		int secoundnum = 1;
		int nextnumber = 0;
		System.out.println("Enter a number for Fibonacci series = ");

		int num = scan.nextInt();

		isFibonacciSeries(num, firstnum, secoundnum, nextnumber);

	}

	static void isFibonacciSeries(int num, int firstnum, int secoundnum, int nextnumber) {

		for (int i = 3; i <= num; i++) {
			nextnumber = firstnum + secoundnum;
			System.out.print(nextnumber + " ");
			firstnum = secoundnum;
			secoundnum = nextnumber;

		}

	}

}

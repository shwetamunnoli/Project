package com.kn.forloop;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for tables = ");
		int num = scan.nextInt();
		int i = 1;
		int multi = multiplicationTables(num, i);
	}

	private static int multiplicationTables(int num, int i) {
		for (i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + i * num);
		}
		return i * num;
	}

}

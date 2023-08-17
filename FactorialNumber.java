package com.kn.forloop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for factorial number = ");
		int num = scan.nextInt();
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}

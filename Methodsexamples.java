package com.accessmodifier;

import java.util.Scanner;

public class Methodsexamples {

	public int add(int a, int b) {
		System.out.println("Addition of two numbers: " + (a + b));
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println("Subtraction of two numbers: " + (a - b));
		return a - b;
	}

	public int mul(int a, int b) {
		System.out.println("Multiplication of two numbers: " + (a * b));
		return a * b;
	}

	public int div(int a, int b) {
		System.out.println("Division of two numbers: " + (a / b));
		return a / b;
	}

	public int mod(int a, int b) {
		System.out.println("Mod of two numbers: " + (a % b));
		return a % b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		Methodsexamples ob = new Methodsexamples();
		System.out.println("Case 1: Add");
		System.out.println("Case 2: Sub");
		System.out.println("Case 3: Mul");
		System.out.println("Case 4: Div");
		System.out.println("Case 5: Mod");
		System.out.println("Enter your choice: ");
		c = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		switch (c) {
		case 1:
			ob.add(a, b);
			break;
		case 2:
			ob.sub(a, b);
			break;
		case 3:
			ob.mul(a, b);
			break;
		case 4:
			ob.div(a, b);
			break;
		case 5:
			ob.mod(a, b);
			break;
		}
	}

}

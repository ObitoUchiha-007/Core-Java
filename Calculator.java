package com.edu;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a:");
	int a1=sc.nextInt();
	System.out.println();
	System.out.println("Enter b:");
	int a2=sc.nextInt();
	System.out.println();
	int sum;
	sum=(a1+a2);
	System.out.println("Sum:"+sum);
	System.out.println();
	int sub;
	sub=(a1-a2);
	System.out.println("Sub:"+sub);
	System.out.println();
	int mul;
	mul=(a1*a2);
	System.out.println("Mul:"+mul);
	System.out.println();
	int div;
	div=(a1/a2);
	System.out.println("Div:"+div);
	System.out.println();
	int m;
	m=(a1%a2);
	System.out.println("Sum:"+m);
	System.out.println();
}
}

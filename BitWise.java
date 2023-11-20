package Operators;

import java.util.Scanner;

public class BitWise {
public static void main(String[] args) {
	System.out.println("BitWise Operators");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A: ");
	int a=sc.nextInt();
	System.out.println("Enter B: ");
	int b=sc.nextInt();
	int c= a|b;
	int d= a&b;
	int e= a^b;
	int f=~a;
	int g=~b;
	System.out.println("A | B = "+c);
	System.out.println("A & B = "+d);
	System.out.println("A ^ B = "+e);
	System.out.println("Negation of A = "+f);
	System.out.println("Negation of B = "+g);
	
}
}

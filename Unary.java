package Operators;

import java.util.Scanner;

public class Unary {
public static void main(String[] args) {
	//Post Increment
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Post Increment: ");
	int a=sc.nextInt();
	int b=a++;
	System.out.println("Post Increment");
	System.out.println("--------------");
	System.out.println("B: "+b);
	System.out.println("A: "+a);
	
	//Pre Increment
	System.out.println("Enter the Pre Increment: ");
		int a1=sc.nextInt();
		int b1=++a1;
		System.out.println("Pre Increment");
		System.out.println("--------------");
		System.out.println("B1: "+b1);
		System.out.println("A1: "+a1);
		
		//Post Decrement
		System.out.println("Enter the Post Decrement: ");
		int a2=sc.nextInt();
		int b2=a2--;
		System.out.println("Post Decrement");
		System.out.println("--------------");
		System.out.println("B2: "+b2);
		System.out.println("A2: "+a2);
		
		//Pre Decrement
		System.out.println("Enter the Pre Decrement: ");
		int a3=sc.nextInt();
		int b3=--a3;
		System.out.println("Pre Decrement");
		System.out.println("--------------");
		System.out.println("B3: "+b3);
		System.out.println("A3: "+a3);
}
}

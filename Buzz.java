package com.numbers;

import java.util.Scanner;

public class Buzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		if(n%10==7||n/7==0)
		{System.out.println("Buzz number");
		}
		else
		{
			System.out.println("Not a Buzz Number!");
		}
		sc.close();

	}

}

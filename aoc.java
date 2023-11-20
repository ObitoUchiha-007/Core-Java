package Operators;

import java.util.Scanner;

public class aoc {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter radius: ");
			double r=sc.nextInt();
			double aoc=3.14*r*r;
			System.out.println("Area of Circle: "+aoc);
	}

}

package Operators;

import java.util.Scanner;

public class Aor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght: ");
		double l=sc.nextInt();
		System.out.println("Enter Breath: ");
		double b=sc.nextInt();
		double aor=l*b;
		System.out.println("Area of Rectangle: "+aor);
	}

}

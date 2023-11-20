package Operators;

import java.util.Scanner;

public class aot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Breath: ");
	double b=sc.nextInt();
	System.out.println("Enter Height: ");
	double h=sc.nextInt();
	double aot=0.5*h*b;
	System.out.println("Area of Triangle: "+aot);
}
}

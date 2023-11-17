package com.edu;

import java.util.Scanner;

public class UserInputDemo {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter your name:");
String name=sc.nextLine();
System.out.println("My name:"+name);
System.out.println();
System.out.println("Enter your age:");
int age=sc.nextInt();
System.out.println("My Age:"+age);
System.out.println("Enter your score");
float per=sc.nextFloat();
System.out.println("My percentage:"+per);
Scanner a= new Scanner(System.in);
System.out.println("Enter a:");
int a1=sc.nextInt();
System.out.println("A:"+a1);
System.out.println();
System.out.println("Enter b:");
int a2=sc.nextInt();
System.out.println("B:"+a2);
System.out.println();
System.out.println("Sum");
int sum=sc.nextInt();
sum=(a1+a2);
System.out.println("Sum:"+sum);
System.out.println();
}
}

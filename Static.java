package com.variables;

public class Static {
	class Sdemo{
		static {System.out.println("Student Detials");}
		static int a=200;
		static String name="MADHU";
		 static int age=21;
		 static String email="msmadhu@gmail.com";
		 static String ph="8861781869";
	}
 static int a;
 static float b;
 static String name="TEJAS";
 static int age=20;
 static String email="cr02@gmail.com";
 static String ph="7022669812";
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("PERSONAL DETIALS");
		System.out.println("================");
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("CONTACT DETIALS");
		System.out.println("EMAIL: "+email);
		System.out.println("Phone No: "+ph);
		System.out.println("STATIC CLASS");
		System.out.println("============");
		System.out.println(Sdemo.a);
		System.out.println("PERSONAL DETIALS");
		System.out.println("================");
		System.out.println(Sdemo.name);
		System.out.println(Sdemo.age);
		System.out.println("CONTACT DETIALS");
		System.out.println("===============");
		System.out.println(Sdemo.email);
		System.out.println(Sdemo.ph);
	}

}

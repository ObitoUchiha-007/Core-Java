package com.variables;

public class Instance {
		int a;
		float b;
		long c;
		String s;
		double d;
		byte e;
		char f;
		boolean g;
		String name="TEJAS";
		String department="CSE";
		int age=20;
		float sal;
		long exp;
		String email="cr02tejas@gmail.com";
		String address="Bengaluru";
		String ph="7022669812";
		public static void main(String[] args) {
			Instance ob=new Instance();
			System.out.println(ob.a);
			System.out.println(ob.b);
			System.out.println(ob.c);
			System.out.println(ob.d);
			System.out.println(ob.e);
			System.out.println(ob.f);
			System.out.println(ob.g);
			System.out.println(ob.s);
			System.out.println("NAME:"+ob.name);
			System.out.println("DEPARTMENT:"+ob.department);
			System.out.println("AGE:"+ob.age);
			System.out.println("CONTACT DETAILS");
			System.out.println("===============");
			System.out.println("EMAIL:"+ob.email);
			System.out.println("ADDRESS:"+ob.address);
			System.out.println("PHONE NUMBER:"+ob.ph);
			System.out.println("SALARY:"+ob.sal);
			System.out.println("EXPERIENCE:"+ob.exp);
		}
}

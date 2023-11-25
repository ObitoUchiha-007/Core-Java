package com.construtor;

class A {
	int rollNo = 123;
	String name = "Madhu";
	int price=7500000;
	String cname="Ford Mustang";
	String cm="GT";
	String b="Madhu";
	String s="TEJAS";
	int price1=20000000;
	String cname1="Bugatti";
	String cm1="Chiron";
	String b1="TEJAS";
	String s1="MADHU";
	double tax=19.00;

	A() {
		System.out.println("Student Details");
	}
	
	A(int price,String cname,String cm,String b,String s)
	{
		 this.price=price;
		 this.cname=cname;
		 this.cm=cm;
		 this.b=b;
		 this.s=s;
		 
	}
	
	A(int price1,String cname1,String cm1,String b1,String s1,double tax)
	{
		 this.price1=price1;
		 this.cname1=cname1;
		 this.cm1=cm1;
		 this.b1=b1;
		 this.s1=s1;
		 this.tax=tax;
		 
	}

	public A(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	
	}

public class Demo {
	public static void main(String[] args) {
		A ob1 = new A();
		A ob = new A(101, "Madhu");
		A ob2=new A(7500000,"Mustang","GT","MADHU","TEJAS");
		A ob3=new A(200000000,"Bugatti","Chiron","TEJAS","MADHU",20);
		//Student Details
		System.out.println("Student Details");
		System.out.println("Name is "+ob.name);
		System.out.println("rollNo is"+ob.rollNo);
		System.out.println();
		//Car 1
		System.out.println("Car 1");
		System.out.println("Car: "+ob.cname);
		System.out.println("Modle: "+ob.cm);
		System.out.println("Price: "+ob.price);
		System.out.println("Seller: "+ob.s);
		System.out.println("Buyer: "+ob.b);
		System.out.println();
		//Car 2
		System.out.println();
		System.out.println("Car 2");
		System.out.println("Car: "+ob3.cname1);
		System.out.println("Modle: "+ob3.cm1);
		System.out.println("Price: "+ob3.price1);
		System.out.println("Seller: "+ob3.s1);
		System.out.println("Buyer: "+ob3.b1);
		System.out.println("Tax: "+ob3.tax);
		
	}

}

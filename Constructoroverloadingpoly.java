package com.Polymorphism;

class B{
	B()
	{
		System.out.println("No agrs constructor");
	}
	
	B(String name)
	{
		System.out.println("1 agr constructor");
	}
	
	B(String name,int rollNo)
	{
		System.out.println("2 agr constructor");
	}
	
	B(String name,int rollNo,int usn)
	{
		System.out.println("3 agr constructor");
	}
	
	B(String name,int rollNo,int usn,int phno)
	{
		System.out.println("4 agr constructor");
	}
	
	B(int usn,String rollNo)
	{
		System.out.println("Interchange 2 agr constructor");
	}
}
public class Constructoroverloadingpoly {

	public static void main(String[] args) {
		B ob=new B();
		B ob1=new B("TEJAS");
		B ob2=new B("TEJAS",123);
		B ob3=new B("TEJAS",123,456);
		B ob4=new B("TEJAS",123,456,007);
		B ob5=new B(123,"123");
		
	}

}

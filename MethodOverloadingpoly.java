package com.Polymorphism;
//--------------One name multiple forms-----------------
/*
 * Overloading---> The class which has same method name but different parameters
 * EARLY BINDING
 * COMPLIE TIME
 * 
 * Methods to overload:
 * 1.By having parameters
 * 2.By having the parameters interchanged
 */
class Test{
	public void display()
	{System.out.println("No args");

	}
	public void display(int a)
	{
		System.out.println("1 Arg");
	}
	public void display(int a,int b)
	{
		System.out.println("2 Args");
	}
	public void display(int a,int b,int c)
	{
		System.out.println("3 Args");
	}
	public void display(int a,float b)
	{
		System.out.println("2 Args with interchange value");
	}
	public void display(float a,int b)
	{
		System.out.println("2 Args with interchange value");
	}
}
public class MethodOverloadingpoly {

	public static void main(String[] args) {
		Test ob=new Test();
		ob.display();
		ob.display(10);
		ob.display(20, 30);
		ob.display(80, 90, 100);
		ob.display(40, 50.5f);
		ob.display(60, 70.5f);
		
	}

}

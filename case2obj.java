package com.typepromotion;

class A1{
	public void display(Object o)
	{
		System.out.println("Root class");
	}
	
	public void display(String s)
	{
		System.out.println("Child class");
	}
}
public class case2obj {

	public static void main(String[] args) {
		A1 ob=new A1();
		ob.display(new Object());
		ob.display(10);
		ob.display(null);
		ob.display("TEJ");
	}

}

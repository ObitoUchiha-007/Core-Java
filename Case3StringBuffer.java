package com.typepromotion;

class A3{
	public void display(StringBuffer s)
	{
		System.out.println("Child 1");
	}
	public void display(String a)
	{
		System.out.println("Child 2");
	}
}
public class Case3StringBuffer {

	public static void main(String[] args) {
		A3 ob=new A3();
		ob.display("TEJ");
		ob.display("MADHU");
		ob.display(new StringBuffer());

	}

}

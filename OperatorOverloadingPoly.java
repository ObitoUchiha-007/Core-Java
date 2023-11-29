package com.Polymorphism;
class C{
	String w="World";
	public void display()
	{System.out.println("Hello"+w);
}
	public void display(int a,int b)
	{System.out.println("Add: "+(a+b));
}
}
public class OperatorOverloadingPoly {

	public static void main(String[] args) {
		C ob=new C();
		ob.display();
		ob.display(10, 40);
	}

}
package com.typepromotion;
class A4{
	public void display(int a) {
		System.out.println("Integer");
	}
	public void display(float a) {
		System.out.println("Float");
	}
	public void display(int... a) {
		System.out.println("Integer...");
	}
}
public class Case4 {

	public static void main(String[] args) {
		A4 ob=new A4();
		ob.display(4.5f);
		ob.display(10);
		ob.display(1,2,3,4,5);
	}

}

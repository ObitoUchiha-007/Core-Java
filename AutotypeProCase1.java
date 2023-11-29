package com.typepromotion;
class A{
	public void show(int a)
	{
		System.out.println("Integer Type: ");
	}
	
	public void show(float a)
	{
		System.out.println("Float Type: ");
	}
}
public class AutotypeProCase1 {

	public static void main(String[] args) {
		A ob=new A();
		ob.show(10);
		ob.show(2.2f);
		ob.show('C');
		
	}

}

package com.Polymorphism;

class Cart{
	public void bill(String itemname)
	{
		System.out.println("ITEM NAME");
	}
	
	public void bill(String itemname,int quantity)
	{
		System.out.println("ITEM NAME & Quantity");
	}
	
	public void bill(String itemname,int quantity,String size)
	{
		System.out.println("ITEM NAME,Quantity & Size");
	}
	
	public void bill(String itemname,int quantity,String size,String color)
	{
		System.out.println("ITEM NAME,Quantity,Size & Color");
	}
	
}
public class Shoopingcartmopoly {

	public static void main(String[] args) {
		Cart ob=new Cart();
		ob.bill("Pen");
		ob.bill("Pencil", 2);
		ob.bill("Coffee", 2,"Small" );
		ob.bill("Exam Pad", 2, "Large", "RED");
	}

}

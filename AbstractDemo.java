package com.abstraction;

abstract class Fruit{
public abstract void taste();
}
class Mango extends Fruit{

	public void taste() {
		System.out.println("Sweet");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Mango ob=new Mango();
		ob.taste();

	}

}

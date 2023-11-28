package com.inheritence;

interface Parent1 {
	public void parent1Properties();
}

interface Parent2 {
	public void parent2Properties();
}

class Child implements Parent1, Parent2 {

	public void parent1Properties() {
		System.out.println("Extending properties from Parent1 ");

	}

	public void parent2Properties() {
		System.out.println("Extending properties from Parent2 ");

	}

}

public class multipleinheritanceex {

	public static void main(String[] args) {
		Child ob = new Child();
		ob.parent1Properties();
		ob.parent2Properties();

	}

}

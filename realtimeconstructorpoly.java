package com.Polymorphism;

class A10{
	A10(){
		System.out.println("hello");
	}
	A10(int a){
		this();
		System.out.println("hi");
		
	}
	A10(int a,int b){
		this(a);
		System.out.println("world");
	}
	A10(int a,int b,int c){
		this(a,b);
		System.out.println("TEJ");
	}
}
public class realtimeconstructorpoly {

	public static void main(String[] args) {
		A10 ob3=new A10(10,4,3);
		

	}

}
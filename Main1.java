package com.accessmodifier;

import com.acessmodifier1.A;
class B{
	private int submarks=60;
}
public class Main1 {
	private int submarks=70;
	public static void main(String[] args) {
		A ob=new A();
		System.out.println(ob.marks);
		Main1 ob1=new Main1();
		System.out.println(ob1.submarks);
		
	}

}

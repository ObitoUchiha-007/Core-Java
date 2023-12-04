package com.collection;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<String> a=new Stack<>();
		a.push("Element 1");
		a.push("Element 2");
		a.push("Element 3");
		
		System.out.println("Pushed Elements: "+a);
		
		String pe=a.pop();
		System.out.println("Popped element: "+pe);
		
		String pe1=a.push("Element 4");
		System.out.println("Pushes Element: "+pe1);
		
		int se=a.search(pe1);
		System.out.println("Search: "+ se);
	}

}

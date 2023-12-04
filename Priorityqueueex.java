package com.collection;

import java.util.PriorityQueue;

public class Priorityqueueex {

	public static void main(String[] args) {
		PriorityQueue<Integer> a = new PriorityQueue<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		//a.add(3);//Accepts Duplicate values
		//a.add(null);//Does not accepts the null value;
		System.out.println("Added elements: "+a);
		
					
		
		a.remove(4);
		System.out.println("After removing elements: "+a);
		a.toArray();
		System.out.println(a);
		System.out.println("Contains: "+a.contains(3));
		
		System.out.println("Size: "+a.size());
		
		System.out.println("Is it Empty: "+a.isEmpty());
		
		System.out.println("Peek: "+a.peek());
		a.peek();
		System.out.println("Peek: "+a);
		
		System.out.println();
		
		System.out.println("Poll: "+a.poll());
		
		a.poll();
		System.out.println("Poll:"+a);
		a.clear();
		//a.remove();
		System.out.println(a);
		a.poll();
		a.add(1);
		a.add(2);
		a.add(3);
		
		System.out.println("Set:"+a);
		a.peek();
		System.out.println(a);
	}

}

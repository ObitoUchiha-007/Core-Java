package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Union_Intersection_ex {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		System.out.println("UNION");
		a.add(1);
		a.add(2);

		System.out.println("A: "+ a);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		System.out.println("B: "+ b);
		
		a.addAll(b);
		System.out.println("UNION:"+a);
		//a.removeAll(b);
		//System.out.println("Difference:"+a);
		
		System.out.println();
		
		Set<Integer> a1 = new HashSet<Integer>();
		Set<Integer> b1 = new HashSet<Integer>();
		System.out.println("INTERSECTION");
		a1.add(1);
		a1.add(2);

		System.out.println("A1: "+ a1);
		b1.add(2);
		b1.add(3);
		b1.add(4);
		b1.add(5);
		System.out.println("B1: "+ b1);
		
		a1.retainAll(b1);
		System.out.println("INTERSECTION: "+a1);
		
		System.out.println();
		
		Set<Integer> a2 = new HashSet<Integer>();
		Set<Integer> b2 = new HashSet<Integer>();
		System.out.println("DIFFERENCE");
		a2.add(1);
		a2.add(2);

		System.out.println();
		
		System.out.println("A1: "+ a2);
		b2.add(2);
		b2.add(3);
		b2.add(4);
		b2.add(5);
		System.out.println("B1: "+ b2);
		b2.removeAll(a2);
		System.out.println("DIFFERENCE: "+b2);
		
		
	}

}

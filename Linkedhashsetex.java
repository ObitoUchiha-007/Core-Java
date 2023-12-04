package com.collection;


import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashsetex {

	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(1);
		set1.add(4);
		set1.add(2);
		System.out.println("Set 1: "+set1);
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(4);
		set2.add(6);
		set2.add(5);
		System.out.println("Set 2: "+set2);
		
		Set<Integer> union=new LinkedHashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);
		
		Set<Integer> intersection=new LinkedHashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection);
	}

}

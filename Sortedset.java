package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		SortedSet<Integer> set1=new TreeSet<Integer>();
		set1.add(1);
		set1.add(4);
		set1.add(2);
		System.out.println("Set 1: "+set1);
		
		SortedSet<Integer> set2=new TreeSet<Integer>();
		set2.add(4);
		set2.add(6);
		set2.add(5);
		System.out.println("Set 2: "+set2);
		
		SortedSet<Integer> union=new TreeSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union: "+union);
		
		SortedSet<Integer> intersection=new TreeSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: "+intersection);

	}

}

package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(4);
		System.out.println(hs);
		hs.add(2);
		hs.add(3);
		hs.remove(4);
		hs.add(null);
		
		System.out.println(hs);
	}

}

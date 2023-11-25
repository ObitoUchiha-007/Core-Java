package com.array;

public class Multidemen {

	public static void main(String[] args) {
		int x[][]=new int [6][3];
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[0].length+x[1].length+x[2].length+x[3].length+x[4].length+x[5].length);

		
		
		int x1[][][]= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}},{{120,130}}};
		System.out.println(x1[0] [1] [2]);  //60
		System.out.println(x1[1][1][1]);    //100
		System.out.println(x1[1][0][1]);    //80
		System.out.println(x1[2][0][1]);    //AIOE
		}
	}

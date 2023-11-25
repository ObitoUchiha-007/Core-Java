package Operators;

public class StringDemo {
//concat
	public static void main(String[] args) {
		String str="Hello";
		String str1=" World";
		System.out.println(str.concat(str1));
		
		String str2=new String("hello");
		str2.concat("world");
		System.out.println(str2);
		
//Length
		String s="Hello";
		double s1=s.length();
		System.out.println(s1);
		
		
//CharAt
		
		String s2="Hello Worldj";
		char c=s2.charAt(6);
		System.out.println(c);
		
//Substring
		
		String s3="hello world";
		String s4=s3.substring(1,6);
		System.out.println(s4);
		
	//Equals
		
		String s5="Shalini";
		String s6="ShalinI";
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//Uppercase
		String s7="shalini";
		System.out.println(s7.toUpperCase());
		
	//Lowercase
		String s8="SHALINI";
		System.out.println(s8.toLowerCase());
		
		
		
//Contains
		
		String s9="TEJAS AND MADHU";
		System.out.println(s9.contains("TEJAS"));
		System.out.println(s9.contains("MADHU"));
		System.out.println(s9.contains("AND"));
		System.out.println(s9.contains("Hi"));
		
//Replace
		
		String r="Taj";
		System.out.println(r.replace('a', 'e'));
		
		
//Trim
		String t="    Welcome";
		System.out.println(t.trim());
	}
}

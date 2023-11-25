package com.accessmodifier;

public class Methods {
		public void display() {System.out.println("Hello");}
		public void display1(){System.out.println("World");}
		public void display2(int a,int b)
		{
			System.out.println("Addition of two numbers: "+(a+b));
			System.out.println("Subtraction of two numbers: "+(a-b));
			System.out.println("Multiplication of two numbers: "+(a*b));
			System.out.println("Division of two numbers: "+(a/b));
			System.out.println("Modulus of two numbers: "+(a%b));
		}
		
		public int intadd(int a,int b)
		{System.out.println("Addition of two numbers: "+(a+b));
			return a+b;
		}
		
		public int intsub(int a,int b)
		{System.out.println("Subtraction of two numbers: "+(a-b));
			return a-b;
		}
		
		public int intmul(int a,int b)
		{System.out.println("Multiplication of two numbers: "+(a*b));
			return a*b;
		}
		
		public int intdiv(int a,int b)
		{System.out.println("Division of two numbers: "+(a/b));
			return a/b;
		}
		
		public int intmod(int a,int b)
		{System.out.println("Modulus of two numbers: "+(a%b));
			return a%b;
		}
		
		public void eod(int n)
		{
			if(n%2==0)
		{System.out.println("Even");}
		else {System.out.println("Odd");}
		}
		
		
		public int display3() {
			System.out.println("Hello");
			return 0;
			}
		
		
	public static void main(String[] args) {
		Methods ob=new Methods();
		ob.display();
		ob.display1();
		ob.eod(2);
		ob.display2(2, 2);
		ob.display3();
		ob.intadd(5, 5);
		ob.intsub(5, 5);
		ob.intmul(5, 5);
		ob.intdiv(5, 5);
		ob.intmod(5, 5);

	}

}

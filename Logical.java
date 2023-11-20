package Operators;

public class Logical {
public static void main(String[] args) {
	System.out.println("BitWise &");
	int x=10;
	int y=15;
	if(++x<10 & ++y>15)
	{x++;}
	else {y++;}
	System.out.println(x);
	System.out.println(y);
	
	System.out.println("BitWise |");
	int x1=10;
	int y1=15;
	if(++x1<10 | ++y1>15)
	{x1++;}
	else {y1++;}
	System.out.println();
	System.out.println(x1);
	System.out.println(y1);
	
	System.out.println("Logical &&");
	int x2=10;
	int y2=15;
	if(++x2<10 && ++y2>15)
	{x2++;}
	else {y2++;}
	System.out.println();
	System.out.println(x2);
	System.out.println(y2);
	
	System.out.println("Logical ||");
	int x3=10;
	int y3=15;
	if(++x3<10 || ++y3>15)
	{x3++;}
	else {y3++;}
	System.out.println();
	System.out.println(x3);
	System.out.println(y3);
}
}

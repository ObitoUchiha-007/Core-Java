package Operators;

public class ConditionalOp {
public static void main(String[] args) {
	int a=20;
	int b=30;
	int c=40;
	int max;
	int max1;
	int min;
	int min1;
	min=(a<b)? a:b;
	System.out.println("Min"+min);
	max=(a>b)? a:b;
	System.out.println("Max"+max);
	max1=a > b  ? (a > c ? a:b)  : b > c ? b : c;
	min1=a < b  ? (a < c ? a:b)  : b < c ? b : c;
	
}
}

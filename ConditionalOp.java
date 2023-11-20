package Operators;

public class ConditionalOp {
public static void main(String[] args) {
	int a=20;
	int b=30;
	int max;
	int min;
	min=(a<b)? a:b;
	System.out.println("Min"+min);
	max=(a>b)? a:b;
	System.out.println("Max"+max);
}
}

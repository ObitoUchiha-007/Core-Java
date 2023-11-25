package Operators;

public class AssignmentOp {

	public static void main(String[] args) {
          int a=10;
          int b=20;
          //b+=a
          a+=b;
          int c=a-=b;
          int d=a*=b;
          int e=a/=b;
          int f=a%=b;
          int g=a&=b;
          int i= a=b;
          int j=a|=b;
          int k=a^=b;
       	  int l=a>>=b;
    	  int m=a<<=b;
       	  int n=a>>>=b;
          System.out.println("Add: "+a);
          System.out.println("Sub: "+c);
          System.out.println("Mul: "+d);
          System.out.println("Div: "+e);
          System.out.println("Modulus: "+f);
          System.out.println("&=: "+g);
          System.out.println("==: "+i);
          System.out.println("|=: "+j);
          System.out.println("^=: "+k);
          System.out.println("Double left Shift: "+l);
          System.out.println("Double Right Shift: "+m);
          System.out.println("Triple Right Shift: "+n);
          }

}

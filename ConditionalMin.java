package Operators;

public class ConditionalMin {
    public static void main(String[] args) {
    	int min,a=10,b=20,c=30,d=40,e=50;
	min=(a<b && a<c && a<d && a<e)? a:
  	  (b<a && b<c && b<d && b<e)? b:
  		  (c<b && c<a && c<d && c<e)? c:
  	    	  (d<a && d<c && d<b && d<e)? d:
  	    		  (e<b && e<c && e<a && e<d)? e:d;
    System.out.println(min);
}
}

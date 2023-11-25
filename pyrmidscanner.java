package iterativeStatment;

import java.util.Scanner;

public class pyrmidscanner {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the pattern");
	        int i,j,k;
	        int row=sc.nextInt();
	        for(i=1;i<=row;i++) {
	      	  for(j=5;j>=i;j--) {
	      		  System.out.print(" ");
	      	  }
	      	  for(k=1;k<=i;k++) {
	      		  System.out.print(" *");
	      	  }
	      	  System.out.println( );
	      	  }
	        
	        for(i=1;i<=row;i++) {
	      	  for(j=0;j<=i;j++) {
	      		  System.out.print(" ");
	      	  }
	      	  for(k=4;k>=i;k--) {
	      		  System.out.print(" *");
	      	  }
	      	  System.out.println( );
	        }
		}

	}
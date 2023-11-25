package iterativeStatment;

import java.util.Scanner;

public class dowhileeod {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    String c = null;
		    do {
		        int i;
		        System.out.println("Enter a Number:");
		        int n = sc.nextInt();

		        for(i=1; i<n; i++) {
		            System.out.println(i);
		            if(n%2==0) {
		                System.out.println(i + " " );

		            }
		            System.out.println("Try Again? Y/N");
		            c = sc.next();   

		        }
		    }while(c.equalsIgnoreCase("y"));
		}

	}
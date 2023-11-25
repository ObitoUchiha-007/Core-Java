package iterativeStatment;

import java.util.Scanner;

public class positivenegativedow {

	public static void main(String[] args) {
		int num;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a num: "); 
			num=sc.nextInt();
			 if(num==1)
			 {System.out.println("Positive");}
			 else
			 {System.out.println("Negative");}
		}while(num<=0);

	}

}

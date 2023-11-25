package SelectionStatments;

import java.util.Scanner;

public class Studmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage: ");
		int per=sc.nextInt();
		if(per>=90)
		{System.out.println("Explempary");}
		else if(per>=80)
		{System.out.println("Distinction");}
		else if(per>=65)
		{System.out.println("First Class");}
		else if(per>=50)
		{System.out.println("Second Class");}
		else if(per<35)
		{System.out.println("Fail");}

	}

}

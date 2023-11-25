package Operators;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username: ");
		String un=sc.next();
		System.out.println("Enter the password: ");
		String p=sc.next();
        if(un.equals("Tej") && p.equalsIgnoreCase("tejas@123"))
        {
        	System.out.println("Sucessfully LoggedIn!");
        }
        else
        { System.out.println("Username or Password is Invalid!!");
	}

}
}
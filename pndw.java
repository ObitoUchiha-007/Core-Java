package iterativeStatment;

import java.util.Scanner;

public class pndw {

	public static void main(String[] args) {
		int num;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			num = sc.nextInt();
			if (num != 0)
				System.out.println("The given number is positive");
		} while (num <= 0);
	}

}

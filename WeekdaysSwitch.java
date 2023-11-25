package SelectionStatments;

import java.util.Scanner;

public class WeekdaysSwitch {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Week-day: ");
	   int d=sc.nextInt();
		switch(d) {
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thurday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default:
			System.out.println("Invalid Week-Day");
			break;
		}

	}

}

package Operators;
import java.util.Scanner;

public class sc {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the quantity of the item: ");
	        int quantity = scanner.nextInt();

	        System.out.print("Enter the price of the item: ");
	        double price = scanner.nextDouble();
	        
	        double totalBeforeTax = quantity * price;

	        
	        double discount = 0.10 * totalBeforeTax;
	        double discountedTotal = totalBeforeTax - discount;

	        
	        double taxRate = 0.07;
	        double tax = taxRate * discountedTotal;

	        
	        double finalTotal = discountedTotal + tax;

	        
	        System.out.println("Cart");
	        System.out.println("====");
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Price per item: $" + price);
	        System.out.println("Total cost before discount: $" + totalBeforeTax);
	        System.out.println("Discount: $" + discount);
	        System.out.println("Discounted total: $" + discountedTotal);
	        System.out.println("Tax: $" + tax);
	        System.out.println("Final total: $" + finalTotal);

	        // Close the scanner
	        scanner.close();
	    }
	
}
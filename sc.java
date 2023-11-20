package Operators;
import java.util.Scanner;

public class sc {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the quantity and price of an item from the user
	        System.out.print("Enter the quantity of the item: ");
	        int quantity = scanner.nextInt();

	        System.out.print("Enter the price of the item: ");
	        double price = scanner.nextDouble();

	        // Calculate the total cost before tax
	        double totalBeforeTax = quantity * price;

	        // Assume a 10% discount on the total cost
	        double discount = 0.10 * totalBeforeTax;
	        double discountedTotal = totalBeforeTax - discount;

	        // Assume a 7% tax on the discounted total
	        double taxRate = 0.07;
	        double tax = taxRate * discountedTotal;

	        // Calculate the final total cost
	        double finalTotal = discountedTotal + tax;

	        // Display the results
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
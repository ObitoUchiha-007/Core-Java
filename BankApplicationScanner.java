package com.Encapsulation;

import java.util.Scanner;

class Bank{
		private int bal;
		private int amt;
		
		
		public Bank(int bal, int amt) {
			super();
			this.bal = bal;
			this.amt = amt;
		}


		public int getAmt() {
			return amt;
		}


		public void setAmt(int amt) {
			this.amt = amt;
		}
		
		public int getBal() {
			return bal;
		}


		public void setBal(int bal) {
			this.bal = bal;
		}
		
		public int w(int amt)
		{
			if(bal>amt)
			{System.out.println("Balance"+bal);
			}
			else
			{System.out.println("No Sufficient Balance");}
			return bal-=amt;
		}
		
		public int d(int amt)
		{
			System.out.println("Initial Balance: "+bal);
			return bal+=amt;
		}
	}
	public class BankApplicationScanner {
		public static void main(String[] args) {
			Bank ob=new Bank(10000,0);
			System.out.println("Balance: "+ob.getBal());
			System.out.println("Deposit:  "+ob.d(5000));
			System.out.println("Withdrawal: "+ob.w(1000));
			
			//Scanner class
			Scanner sc=new Scanner(System.in);
			System.out.println("--Using Scanner Class and User's Input--");
			System.out.println("Enter the amount: ");
			int amt1=sc.nextInt();
			System.out.println("Deposit"+(amt1+ob.getBal()));
			System.out.println("Withdrawal"+(amt1-ob.getBal()));
		}

	}
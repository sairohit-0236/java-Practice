package com.sca;

import java.util.Scanner;

public class Scanmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter User Name ");
		String customername=sc.nextLine();
		
		System.out.println("Enter User Address ");
		String customeraadress=sc.nextLine();
		
		System.out.println("Enter Phone Number ");
		long Phonenumber=sc.nextLong();
		
		System.out.println("Intial Deposited Amount");
		double balance=sc.nextDouble();
		
		
		Scan obj=new Scan(customeraadress, customeraadress, Phonenumber, balance);
		boolean result=true;
		while(result) {
			
		
		System.out.println("-----Select an Option from Below-------");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Show Balance");
		System.out.println("4. Exit");
		System.out.println("Enter your option [1-4]:");
		
		int option=sc.nextInt();
		switch(option) {
		case(1): {
			System.out.println("Enter The withdrawl Amount");
			double amount=sc.nextDouble();
			obj.withdrawamount(amount);
			break;
		}
		case(2):{
			System.out.println("Enter The Deposit Amount");
			double amount=sc.nextDouble();
			obj.deposit(amount);
			break;
		}
		case(3):{
			obj.showbalance();
			break;
		}
		case(4):{
			System.out.println("Thank you!");
			result=false;
			break;
		}
		default:{
			System.out.println("Invalid option");
			break;
		}
		}
		
		}
		sc.close();
	}

}

package com.sca;

public class Scan {
	private String  customername;
	private String customeraddress;
	private long phonenumber;
	private double balance;
	public Scan(String customername,String customeraddress,long phonenumber,double balance) {
		this.customername=customername;
		this.customeraddress=customeraddress;
		this.phonenumber=phonenumber;
		this.balance=balance;
		System.out.println("Account Created successfully");
	}
	//getters
	public String getCustomername() {
		return customername;
	}
	public String getcustomeraddress() {
		return customeraddress;
	}
	public Long getphonenumber() {
		return phonenumber;
	}
	public double balance() {
		return balance;
	}
	//setters
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public void setcustomeraddress(String customeraddress) {
		this.customeraddress=customeraddress;
	}
	public void setphonenumber(long phonenumber) {
		this.phonenumber=phonenumber;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	//methods 
	public void deposit(double amount) {
		if(amount>0) {
			this.balance+=amount;
			System.out.println(this.balance);
		}else {
			System.out.println("Enter valid Amount");
		}
	} 
	public void withdrawamount(double amount) {
		if(balance>=amount) {
			this.balance -=amount;
			System.out.println("withdrawal is successful");
		}else if(amount <=0) {
			System.out.println("Invalid withdrawal amount");
		}else {
			System.out.println("Insufficient funds");
		}
	}
	public void showbalance() {
		System.out.println("Current Balance : "+balance);
	}
}

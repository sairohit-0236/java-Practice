package com.inhert;

import java.util.Scanner;

public class Insurancepolicy {
   private	String  customername;
	private String policytype;
	private double policyamount;
	private double approvedamount;
	private String policystatus;
public Insurancepolicy(String customername,String policytype,double policyamount){
		this.customername=customername;
		this.policytype=policytype;
		if(policyamount>=0) {
			this.policyamount=policyamount;
		}else {
			System.out.println("Invalid Policy Amount");
			this.policyamount=0;
		}
		this.approvedamount = 0;
	    this.policystatus = "Pending";
		System.out.println("policy record has been created");
	}
public Insurancepolicy(String customername,String policytype,double policyamount,double approvedamount,String policystatus){
		this(customername,policytype,policyamount);
		if(approvedamount >= 0 && approvedamount <= policyamount){
		    this.approvedamount = approvedamount;
		} else {
		    System.out.println("Invalid Approved Amount");
		    this.approvedamount = 0;
		}

		if(policystatus != null && !policystatus.equals("")){
		    this.policystatus = policystatus;
		} else {
		    this.policystatus = "Pending";
		}
	}
///----For Updating The Approved Amount-----// 
public void updateapprovedamount(double amount) {
	if(amount >= 0 && amount<=policyamount) {
		this.approvedamount=amount;
		System.out.println("Amount Approved Successfully");
	}else {
		System.out.println("Invalid Approved Amount");
	}
}
///---For Changing The Policy Status---///
public void changepolicystatus(String status) {
	if(status != null && !status.equals("") ) {
		this.policystatus=status;
		System.out.println("Policy Status Changed Successfully");
	}else {
		System.out.println("Invalid Policy status");
	}
}
///---To Print Customer Details---/// 
public void policysummary() {
	System.out.println("Customer Name : "+this.customername);
	System.out.println("Policy Type : "+this.policytype);
	System.out.println("Policy Amount : "+this.policyamount);
	System.out.println("Approved Amount : "+this.approvedamount);
	System.out.println("Policy Status : "+this.policystatus);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
	    String customername = sc.nextLine();

	    System.out.print("Enter Policy Type: ");
	    String policytype = sc.nextLine();

	    System.out.print("Enter Policy Amount: ");
	    double policyamount = sc.nextDouble();

		Insurancepolicy obj=new Insurancepolicy(customername, policytype, policyamount,0.0, "Pending");
		int opt=0;
	 boolean conclude=true;
	 while(conclude){
		 System.out.println("----------Actions--------- ");
		 System.out.println("1. Update Approved Amount");
		 System.out.println("2. Change Policy Status");
		 System.out.println("3. View Policy Summary");
		 System.out.println("4. Exit the program");
		 opt=sc.nextInt();
		 sc.nextLine();
		 switch(opt) {
		 case 1 :{
			 System.out.println("Enter Approval Amount");
			 double amount=sc.nextDouble();
			 obj.updateapprovedamount(amount);
			 break;
		 }
		 case 2 :{
			 System.out.println("Enter New Policy Status");
			 String status=sc.nextLine();
			 obj.changepolicystatus(status);
			 break;
		 }
		 case 3 :{
			 obj.policysummary();
			 break;
		 }
		 case 4 :{
			 System.out.println("Thankyou..");
			 conclude=false;
			 break;
		 }
		 default :{
			 System.out.println("Invalid input");
		 }
		 }	 
	 }sc.close();

	}

}

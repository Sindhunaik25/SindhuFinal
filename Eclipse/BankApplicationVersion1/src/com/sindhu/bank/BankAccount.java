package com.sindhu.bank;//collection of logical classes

public abstract class BankAccount {
	
	//static variable is the one copy shared among the object and it gets loaded the moment class gets loaded
	//static variable not depend on object creation
	private static int autoAccountNo;
	
	
	//instance variables/class variable(their existence depends on the objects,we cannot instance variables if objects are not created)
    private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	
	//init block to remove redundancy
	//before constructors invocation,init execution happens
	{
 		accountNo=++autoAccountNo;
        
	}
	
	//constructor overloading-supplying value before and after 
	//initializing instance variable/class variable
	//at the time of object creation constructor will get automatically called
	//we will not write for loop inside constructor because logically not correct
	public BankAccount()   //default constructor is used before object exists,ex:bank kit we got during acccount creation 
	{
		accountHolderName="Unknown";
		accountBalance=0;
		
	}
	
    
	//parameterized constructor is used when information is supplied then object will be created,ex:normally when we create a bank account
	public BankAccount(String accountHolderName,double accountBalance)
	{
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}
	
	//setter method-modifying or re-initializing member variables
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	//to read only-getter method
	public int getAccountNo() {
		return accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
    
	//service methods
	public void withdraw(double amount)
	{
		accountBalance-=amount;
		/*if(amount<=0)
		{
			System.out.println("Amount should be more than zero");
		}
		else if(amount>accountBalance)
		{
			System.out.println("Account balance is "+accountBalance);
			System.out.println("Enter valid amount");
		}
		else
		{
			accountBalance=accountBalance-amount;
			if(accountBalance<1000){
				System.out.println("Minimum 1000 should be maintained");
				
				}
				else
				{
					System.out.println("Your balance is "+accountBalance);
					System.out.println("Withdraw "+amount);
				}
			}*/
			}
	
	
	public void deposit(double amount)
	{
		this.accountBalance+=amount;
	}
	
	public static void main(String[] args)
	{
		//BankAccount acc=new BankAccount();
		//BankAccount acc2=new BankAccount("sindhu",40000);
		//acc2.withdraw(7000);
		
	}
	
}

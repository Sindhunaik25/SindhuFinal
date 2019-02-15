package com.sindhu.test;

import java.io.ObjectInputStream.GetField;

import com.sindhu.bank.BankAccount;
import com.sindhu.bank.CurrentAccount;
import com.sindhu.bank.SavingAccount;
import com.sindhu.bank.SavingAccountVer2;

public class TestBankAccount {
	public static void testBankAccountMethod() {
		// BankAccount acc = new BankAccount();
		// acc.setAccountHolderName("Sachin");

	}

	public static void testSavingAccount() {
		SavingAccount savingAcc = new SavingAccount("Sindhu", 40000);
		System.out.println("Account No is " + savingAcc.getAccountNo());
		System.out.println("Account Holders name is "
				+ savingAcc.getAccountHolderName());
		System.out.println("Account Balance is "
				+ savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Account balance is "
				+ savingAcc.getAccountBalance());
		System.out.println("-------------------------------");
		savingAcc.withdraw(3000);
		System.out.println("Account balance is "
				+ savingAcc.getAccountBalance());
		System.out.println("Salary account is " + savingAcc.isSalaryAccount());
		System.out.println(" ");
	}

	public static void testCurrentAccount() {
		CurrentAccount currentAcc = new CurrentAccount("Sachin", 50000);
		System.out.println("Account No is " + currentAcc.getAccountNo());
		System.out.println("Account Holders name is "
				+ currentAcc.getAccountHolderName());
		System.out.println("Account Balance is "
				+ currentAcc.getAccountBalance());
		currentAcc.deposit(5000);
		System.out.println("Account balance is "
				+ currentAcc.getAccountBalance());
		System.out.println("-------------------------------");
		currentAcc.withdraw(3000);
		System.out.println("Account balance is "
				+ currentAcc.getAccountBalance());

	}

	public static BankAccount getBankAccount(String accountType) {
		BankAccount acc = null;
		if (accountType.equals("Saving")) {
			acc = new SavingAccount("Sindhu", 4000);
		} else if ((accountType.equals("Current"))) {
			acc = new SavingAccount("Nitin", 7000);
		} else {
			acc = null;
		}
		return acc;
	}

	// main method is only for execution
	public static void main(String[] args) {
		// testBankAccountMethod();
		//testSavingAccount();
		//testCurrentAccount();
		BankAccount acc=getBankAccount("Saving");
		System.out.println("Account name "+acc.getAccountHolderName());
		System.out.println("Account balance "+acc.getAccountBalance());
		acc.withdraw(3000);
	System.out.println("Account Balance "+acc.getAccountBalance());
		SavingAccountVer2 acc1=new SavingAccountVer2();
		acc1.withdraw(4000);
		acc1.deposit(4000);
		acc1.isSalaryAccount();
		acc1.getInsuranceName();
		
		
	}
}

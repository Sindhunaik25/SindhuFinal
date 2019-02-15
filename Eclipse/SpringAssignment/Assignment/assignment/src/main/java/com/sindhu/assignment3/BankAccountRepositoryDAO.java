package com.sindhu.assignment3;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRepositoryDAO {
	private List<BankAccount> bankCustomer;
	public BankAccountRepositoryDAO () {
		bankCustomer=new ArrayList<BankAccount>();
	}

	public boolean addBankCustomer(BankAccount account){
		
		return bankCustomer.add(account);
	}

	public List<BankAccount> getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(List<BankAccount> bankCustomer) {
		this.bankCustomer = bankCustomer;
	}

	@Override
	public String toString() {
		return "BankDAO [bankCustomer=" + bankCustomer + "]";
	}
}

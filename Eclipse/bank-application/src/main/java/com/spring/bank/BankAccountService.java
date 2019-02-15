package com.spring.bank;

public interface BankAccountService {
	public double withdraw(long accountId, double balance,String option);
	public double deposit(long accountId, double balance,String option);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
}

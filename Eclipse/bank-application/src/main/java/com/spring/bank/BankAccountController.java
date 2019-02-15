package com.spring.bank;

public class BankAccountController {
	BankAccountServiceImpl accountServiceImpl;
	
	public BankAccountServiceImpl getAccountServiceImpl() {
		return accountServiceImpl;
	}
	public void setAccountServiceImpl(BankAccountServiceImpl accountServiceImpl) {
		this.accountServiceImpl = accountServiceImpl;
	}
	public double withdraw(long accountId, double balance,String option)
	{
		return accountServiceImpl.withdraw(accountId, balance, option);
		
	}
	public double deposit(long accountId, double balance,String option)
	{
		return accountServiceImpl.deposit(accountId, balance, option);
		
	}
	public double getBalance(long accountId)
	{
		return accountServiceImpl.getBalance(accountId);
		
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont)
	{
		return accountServiceImpl.fundTransfer(fromAccount, toAccount, amont);
		
	}
}

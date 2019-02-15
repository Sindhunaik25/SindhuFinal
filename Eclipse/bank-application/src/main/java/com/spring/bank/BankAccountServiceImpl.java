package com.spring.bank;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountepositoryImpl accountepositoryImpl;

	public BankAccountepositoryImpl getAccountepositoryImpl() {
		return accountepositoryImpl;
	}

	public void setAccountepositoryImpl(
			BankAccountepositoryImpl accountepositoryImpl) {
		this.accountepositoryImpl = accountepositoryImpl;
	}

	@Override
	public double withdraw(long accountId, double balance, String option) {

		return accountepositoryImpl.updateBalance(accountId, balance, option);
	}

	@Override
	public double deposit(long accountId, double balance, String option) {
		System.out.println("service");
		return accountepositoryImpl.updateBalance(accountId, balance, option);
	}

	@Override
	public double getBalance(long accountId) {

		return accountepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {

		return false;
	}

}

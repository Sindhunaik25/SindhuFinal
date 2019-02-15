package com.spring.bank;

import java.util.List;

public class BankAccountepositoryImpl implements BankAccountRepository {
	List<BankAccount> list;

	public List<BankAccount> getList() {
		return list;
	}

	public void setList(List<BankAccount> list) {
		this.list = list;
	}

	@Override
	public double getBalance(long accountId) {
		System.out.println("rep");

		for (BankAccount account : list) {
			if (account.getAccountId() == accountId)

				return account.getAccountBalance();

		}
		return 0.0;
	}

	@Override
	public double updateBalance(long accountId, double balance, String option) {

		for (BankAccount account : list) {
			if (account.getAccountId() == accountId) {
				if (option.equalsIgnoreCase("withdraw")) {
					double afterWithDrawAmount = account.getAccountBalance()
							- balance;
					account.setAccountBalance(afterWithDrawAmount);
					return getBalance(accountId);
				}
				if (option.equalsIgnoreCase("deposit")) {
					double afterDepositAmount = account.getAccountBalance()
							+ balance;
					account.setAccountBalance(afterDepositAmount);
					return getBalance(accountId);

				}
			}
		}

		return 0;
	}

}

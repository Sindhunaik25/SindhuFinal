package com.sindhu.assignment3;

import java.util.List;

public class BankAccountepositoryImpl implements BankAccountRepository{
	
	


	List<BankAccount> accounts=null;
	
	public BankAccountepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public BankAccountepositoryImpl(List<BankAccount> accounts) {
		super();
		this.accounts = accounts;
	}
	
	@Override
	public double getBalance(long accountId) {
	BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null)
		return account.getAccountBalance();
		
		return 0;
	}

	

	@Override
	public double updateBalance(long accountId, double newBalance, String type) {
		
		BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null){
			
			if(type.equals("withdraw")){
				account.setAccountBalance(account.getAccountBalance()-newBalance);
			}
			else if(type.equals("deposit"))
				account.setAccountBalance(account.getAccountBalance()+newBalance);
			return account.getAccountBalance();
			
		}
		return 0;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	private BankAccount getBeanOfBankAccount(long accountId){
		if(accounts!=null){
			for(BankAccount account:accounts ){
				if(account.getAccountId()==accountId){
					return account;
				}
			}
		}
		return null;
	}
	
	
	

}

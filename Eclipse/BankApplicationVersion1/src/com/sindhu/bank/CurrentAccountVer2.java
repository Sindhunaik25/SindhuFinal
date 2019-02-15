package com.sindhu.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance{
	

	public CurrentAccountVer2(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	public String getInsuranceName() {

		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() {

		return 10_00_000;
	}
	
}

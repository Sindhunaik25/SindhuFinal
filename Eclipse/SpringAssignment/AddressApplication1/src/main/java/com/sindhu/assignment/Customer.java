package com.sindhu.assignment;

public class Customer {
	int custId;
	String custName;
	long custContact;
	String custAddress;

	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustContact() {
		return custContact;
	}

	public void setCustContact(long custContact) {
		this.custContact = custContact;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", custContact=" + custContact + ", custAddress="
				+ custAddress + ", address=" + address + "]";
	}

}

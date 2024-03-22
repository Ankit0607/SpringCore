package com.springCore.autowire;

public class emp {
	private address address;

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	} 
}

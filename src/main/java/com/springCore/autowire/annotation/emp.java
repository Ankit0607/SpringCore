package com.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class emp {
	@Autowired
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

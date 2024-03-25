package com.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	@Autowired
	@Qualifier("address1")  // it is used to remove the ambiguity if there is more than one bean of in the config file
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

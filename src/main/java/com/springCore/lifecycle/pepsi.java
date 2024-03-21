package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// implementing interface for init and destroy by interface them no need to add intit method in the config file
public class pepsi implements InitializingBean, DisposableBean {
	private double price;

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public void init() {
//		
//	}
//	public void destroy() {
//		
//	}

	// thi method work as the init method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Going to put bottle back after finishing ");
	}

}

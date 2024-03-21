package com.springCore.lifecycle;

public class samosa {
	private double price;

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}

	public samosa(double price) {
		super();
		this.price = price;
	}

	public samosa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// we can give any name to init method and we have to give same name in the config file also
	public void init() {
		System.out.println("Hey I am intialising the method");
	}

	// we can give any name to the destroy method and same we have to apply in the config file also
	public void destroy() {
		System.out.println("hey I am destroying the method");
	}

}

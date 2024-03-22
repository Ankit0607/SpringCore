package com.springCore.autowire;

public class address {
	private String city;
	private String Country;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "address [city=" + city + ", Country=" + Country + "]";
	}

}

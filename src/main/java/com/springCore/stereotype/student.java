package com.springCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {

	@Value("Radha")
	private String name;

	@Value("Barsana")
	private String city;

	@Value("#{list1}")
	private List<String> address;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;

	@Value("#{T(java.lang.Math).PI}")
	private double e;

	@Value("#{ new java.lang.String('Ankit Mishra')}")
	private String name1;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", address=" + address + ", z=" + z + ", e=" + e
				+ ", name1=" + name1 + "]";
	}

}

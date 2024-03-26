package com.springCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {

	@Value("Radha")
	private String name;

	@Value("Barsana")
	private String city;

	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + "]";
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
}

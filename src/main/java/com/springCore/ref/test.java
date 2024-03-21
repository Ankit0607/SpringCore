package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/refconfig.xml");
		A temp = (A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		
	}

}

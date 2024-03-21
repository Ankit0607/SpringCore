package com.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collections/collectionconfig.xml");
		Emp emp =(Emp)context.getBean("list");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getAddress());
		
	}

}

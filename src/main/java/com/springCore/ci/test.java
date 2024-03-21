package com.springCore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/ci/ciconfig.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);

	}

}

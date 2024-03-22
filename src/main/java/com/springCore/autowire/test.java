package com.springCore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springCore/autowire/autowireconfig.xml");
		emp emp1 = (emp)context.getBean("emp1", emp.class);
		System.out.println(emp1);

	}

}

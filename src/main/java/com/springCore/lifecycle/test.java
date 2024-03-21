package com.springCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springCore/lifecycle/config.xml");
		samosa s1 = (samosa)context.getBean("samosa1");
		System.out.println(s1);
		//registering the shutdown hook for calling destroy method 
		pepsi p1 = (pepsi)context.getBean("pepsi");
		System.out.println(p1);
		context.registerShutdownHook();
		
		example e = (example)context.getBean("example");
		System.out.println(e);
	}

}

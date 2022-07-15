package com.unisys.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
//		Book book = (Book) context.getBean("myBook");
//		System.out.println(book);

//		ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
//		Customer customer = (Customer) context.getBean("customer-1");
//		System.out.println(customer);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("collections-config.xml");
//		CollectionsBean bean = (CollectionsBean) context.getBean("myCollection");
//		System.out.println(bean);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-autowire.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		
		
		((ConfigurableApplicationContext) context).close();
	}

}

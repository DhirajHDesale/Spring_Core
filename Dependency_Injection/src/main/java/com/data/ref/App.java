package com.data.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/data/ref/config.xml");
		Student st = ac.getBean("st2", Student.class);
		System.out.println(st.getAddress().getCity());
	}
}

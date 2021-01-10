package com.listbasedi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ListApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object bean = factory.getBean("id2");
		WelcomeBean wb = (WelcomeBean) bean;

		wb.showStudentData();
	}
}

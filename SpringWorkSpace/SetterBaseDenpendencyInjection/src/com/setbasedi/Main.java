package com.setbasedi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("SetApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object bean = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean) bean;

		wb.showStudentData();
	}
}

package com.mapbasedi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[] args) {
	Resource resource = new ClassPathResource("MapApplicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	
	Object bean = factory.getBean("id3");
	WelcomeBean wb = (WelcomeBean) bean;
	
	wb.showStudentData();
}
}

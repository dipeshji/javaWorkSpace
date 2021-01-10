package com.typesofci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DataType {
public static void main(String[] args) {
	Resource resource = new ClassPathResource("DataTypeAppContext.xml");
	BeanFactory factory = new XmlBeanFactory(resource);

	Object bean = factory.getBean("student");
	System.out.println("DataType type");
	Student stu = (Student) bean;
	stu.displayStudent();
}
}

/*
 * in default type values to constructor from xml are pass left to right
*/

package com.typesofci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DefaultType {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("DefaultAppContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object bean = factory.getBean("student");
		System.out.println("default type");
		Student stu = (Student) bean;
		stu.displayStudent();

	}
}

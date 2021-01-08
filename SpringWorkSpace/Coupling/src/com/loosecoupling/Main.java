package com.loosecoupling;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("application-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		OutputHelper output = new OutputHelper();
		output.generateOutput();
	}
}

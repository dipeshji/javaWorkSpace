package com.mlticlasssdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("MultiClassAppContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object bean = factory.getBean("textEditor");
		TextEditor te = (TextEditor) bean;
		te.spellCheck();
	}
}

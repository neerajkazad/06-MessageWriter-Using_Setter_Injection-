package com.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.beans.IMessageConverter;
import com.si.beans.MessageWriter;

public class SITest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/si/common/application-context.xml"));
		messageWriter = factory.getBean("messageWriter",MessageWriter.class);
		messageWriter.writeMessage("Setter injetion");
	}
}

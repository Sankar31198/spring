package com.ragavan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id1");
		Welcomebean wb = (Welcomebean)o;
		wb.show();

	}

}

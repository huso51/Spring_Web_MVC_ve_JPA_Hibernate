package org.turkeyjug;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMerkez {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		//BeanFactory beanFactory =context;
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		ucgen.ciz();
		
	}

}

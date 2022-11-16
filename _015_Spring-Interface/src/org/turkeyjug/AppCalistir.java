package org.turkeyjug;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		
	//	BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring-cfg.xml"));

		/*		
ClassPathResource classPathResource = new ClassPathResource("spring-cfg.xml");
BeanFactory beanFactory = new XmlBeanFactory(classPathResource);	
*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String [] {"spring-cfg.xml"});
		BeanFactory beanFactory =context;
		
		Araba araba = (Araba) beanFactory.getBean("arabaNesne");
		araba.anahtariCevir();
		
	}

}

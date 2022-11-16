package org.turkeyjug;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring-cfg.xml"));
		Araba araba = (Araba) beanFactory.getBean("arabaNesne");
		araba.anahtariCevir();
		
	}

}

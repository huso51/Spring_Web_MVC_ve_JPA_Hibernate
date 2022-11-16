package org.turkeyjug;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.turkeyjug.config.SpringBeanConfig;

public class AppMerkez {

	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(SpringBeanConfig.class);
		context.refresh();
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		System.out.println(ogrenci.getAdi());
		System.out.println(ogrenci.getSoyadi());
		System.out.println(ogrenci.getSehir().getSehirAdi());
		System.out.println(ogrenci.getSehir().getPlakaNo());
		
		context.close();
		
	}

}

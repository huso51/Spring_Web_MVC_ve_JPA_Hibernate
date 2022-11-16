package org.turkeyjug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");
		System.out.println("ADI    : " + ogrenci.getAdi());
		System.out.println("SOYADI : " + ogrenci.getSoyadi());
		System.out.println("YAŞI   : " + ogrenci.getYasi());
		
		((ConfigurableApplicationContext) context).close();
	}

}

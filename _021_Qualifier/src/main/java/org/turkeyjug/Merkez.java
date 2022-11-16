package org.turkeyjug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Ders ders = (Ders) context.getBean("dersBean");
		
		System.out.println("ADI    : " + ders.getOgrenci().getAdi());
		System.out.println("SOYADI : " + ders.getOgrenci().getSoyadi());
		System.out.println("YAŞI   : " + ders.getOgrenci().getYasi());
		
		System.out.println("DERS   : " + ders.getDersAdi());
		System.out.println("PUAN   : " + ders.getPuan());
		
		
		((ConfigurableApplicationContext) context).close();
	}

}

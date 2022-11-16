package org.turkeyjug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Yazar yazar = context.getBean("yazarBean",Yazar.class);
		
		System.out.println("YAZAR   : " + yazar.getYazarAdi() + " " + yazar.getYazarSoyadi());
		System.out.println("KITAP   : " + yazar.getKitap() );
		System.out.println("ISBN   : " + yazar.getKitap().getEserAdi());
		
		
		
	}

}

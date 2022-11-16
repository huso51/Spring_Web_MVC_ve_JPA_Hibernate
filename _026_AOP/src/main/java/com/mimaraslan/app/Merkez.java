package com.mimaraslan.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.model.Personel;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Personel personel = context.getBean("personelProxyFactoryBean", Personel.class);
		
		
		try {
			personel.adiSoyadiKontrolEt();
			personel.bilgiAl();
			personel.selamlamaYap();			
		} catch (Exception e) {
			System.out.println("HATA MEYDANA GELDI : "+ e);
		}
		
		
		
		((ConfigurableApplicationContext) context).close();
	}
	
}

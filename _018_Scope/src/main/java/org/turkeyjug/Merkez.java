package org.turkeyjug;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		//BeanFactory beanFactory =context;
		
		Selam selamNesnesi1 = (Selam) context.getBean("selam");		
		selamNesnesi1.setMesaj("Güzel gören, güzel düşünür. Güzel düşünen, hayatından lezzet alır.");
		selamNesnesi1.sonuc();
			
		Selam selamNesnesi2 = (Selam) context.getBean("selam");	
		selamNesnesi2.sonuc();
		
		System.out.println(selamNesnesi1);
		System.out.println(selamNesnesi2);	
		
	}

}

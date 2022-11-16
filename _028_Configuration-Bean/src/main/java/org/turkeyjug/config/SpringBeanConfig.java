package org.turkeyjug.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.turkeyjug.Ogrenci;
import org.turkeyjug.Sehir;

@Configuration
public class SpringBeanConfig {
	
/*	
	<bean id="sehir" class="org.turkeyjug.Sehir">
		<property name="sehirAdi" value="Denizli"></property>
		<property name="plakaNo" value="20"></property>
	</bean>
	*/
	@Bean
	public Sehir getSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Denizli");
		sehir.setPlakaNo(20);
		return sehir;
	}
	
/*	
<bean id="ogrenci" class="org.turkeyjug.Ogrenci">
	<property name="adi" value="Arslan"></property>
	<property name="soyadi" value="Topçu"></property>
	<property name="sehir" ref="sehir"></property>
</bean>	
*/
@Bean
public Ogrenci getOgrenci() {
	Ogrenci ogrenci = new Ogrenci();
	ogrenci.setAdi("Ekrem");
	ogrenci.setSoyadi("Akşit");
	ogrenci.setSehir(getSehir());
	return ogrenci;
}


	
	
}

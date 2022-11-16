package org.turkeyjug;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Merkez {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		//personel.setPersonelId(1);
		personel.setPersonelAdi("Ekrem");
		personel.setPersonelSoyadi("Akşit");
		personel.setPersonelEmail("cccc@uuuuu.com");
		//------------------------------------------------
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);
		session.getTransaction().commit();
		
	}

}

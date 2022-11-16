package org.turkeyjug;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.turkeyjug.util.HibernateUtil;

public class Merkez {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		//personel.setPersonelId(1);
		personel.setPersonelAdi("Elxan");
		personel.setPersonelSoyadi("Ismayilov");
		personel.setPersonelEmail("cccc@uuuuu.com");
		//------------------------------------------------
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);
		session.getTransaction().commit();
		
	}

}

package org.turkeyjug.map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.turkeyjug.util.HibernateUtil;

public class Merkez {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = null;
		//------------------------------------------------
		
		try {
			transaction = session.beginTransaction();
			
			Departman  departman = new Departman();
			departman.setDepartmanAdi("Yazilim");
			session.save(departman);
			
			Calisan calisan1 = new Calisan("aaaa", "bbbb");
			Calisan calisan2 = new Calisan("vvvv", "kkkk");
			Calisan calisan3 = new Calisan("rrrr", "tttt");
			
			calisan1.setDepartman(departman);
			calisan2.setDepartman(departman);
			calisan3.setDepartman(departman);
	
			session.save(calisan1);
			session.save(calisan2);
			session.save(calisan3);
			
			
			System.out.println("Kaydedildi.");
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();	
		}finally {
			session.close();
		}

	}

}

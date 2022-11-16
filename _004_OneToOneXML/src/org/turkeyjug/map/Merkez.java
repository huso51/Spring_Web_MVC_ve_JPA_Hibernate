package org.turkeyjug.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.turkeyjug.util.HibernateUtil;

public class Merkez {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = null;
		//------------------------------------------------
		
		try {
			transaction = session.beginTransaction();
			
			OgrenciBilgisi  ogrenciBilgisi = new OgrenciBilgisi();
			ogrenciBilgisi.setAdres("aaaaaa");
			ogrenciBilgisi.setEmail("aaaa@bbbb.com");
			
			
			Ogrenci ogrenci = new Ogrenci();
			ogrenci.setOgrenciAdi("bbbb");
			ogrenci.setOgrenciSoyadi("cccc");
			ogrenci.setOgrenciBilgisi(ogrenciBilgisi);
			
			session.save(ogrenci);
			System.out.println("Kaydedildi.");
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();	
		}finally {
			session.close();
		}

	}

}

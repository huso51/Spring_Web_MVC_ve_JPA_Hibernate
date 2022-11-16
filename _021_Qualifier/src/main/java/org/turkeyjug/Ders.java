package org.turkeyjug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ders {

	
	private Ogrenci ogrenci;
	
	private int puan;
	private String dersAdi;
	//---------------------------------------------
	public Ders() {
	}
	
	public Ders(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	//---------------------------------------------

	public Ogrenci getOgrenci() {
		return ogrenci;
	}
	
	@Autowired
	@Qualifier("ogrenciBean3")
	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	
	
	
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
	
	
	
}

package org.turkeyjug.map;

import java.io.Serializable;

public class OgrenciBilgisi implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer ogrenciId;
	private String adres;
	private String email;
	
	private Ogrenci ogrenci;
	
	public OgrenciBilgisi() {
		// TODO Auto-generated constructor stub
	}

	public OgrenciBilgisi(Integer ogrenciId, String adres, String email, Ogrenci ogrenci) {
		super();
		this.ogrenciId = ogrenciId;
		this.adres = adres;
		this.email = email;
		this.ogrenci = ogrenci;
	}

	public Integer getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(Integer ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}
	
	
	
	
}

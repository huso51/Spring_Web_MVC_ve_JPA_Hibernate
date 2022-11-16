package org.turkeyjug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazarBean")
public class Yazar {

	@Value("Elxan")
	private String yazarAdi;
	
	@Value("İsmayılov")
	private String yazarSoyadi;
	
	@Value("#{kitapBean}")
	private Kitap kitap;
	
	@Value("#{kitapBean.eserAdi}")
	private String kitapAdi;

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}


	
	
	

}

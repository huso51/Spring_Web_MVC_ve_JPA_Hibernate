package org.turkeyjug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapBean")
public class Kitap {

	@Value("Spring Framework")
	private String eserAdi;
	
	@Value("1234567890")
	private long eserISBN;

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	//----------------------------------------


}

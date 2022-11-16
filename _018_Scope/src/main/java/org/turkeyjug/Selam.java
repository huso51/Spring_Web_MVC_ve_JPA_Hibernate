package org.turkeyjug;

public class Selam {

	private String mesaj;

	public Selam() {
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public void sonuc() {
		System.out.println(getMesaj());
	}
	
}

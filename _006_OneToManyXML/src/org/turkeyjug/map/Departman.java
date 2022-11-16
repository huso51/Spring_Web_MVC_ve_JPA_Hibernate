package org.turkeyjug.map;

import java.io.Serializable;
import java.util.Set;

public class Departman implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long departmanId;
	private String departmanAdi;
	
	private Set<Calisan> calisanlar;
	
	public Departman() {
	}

	public Long getDepartmanId() {
		return departmanId;
	}

	public void setDepartmanId(Long departmanId) {
		this.departmanId = departmanId;
	}

	public String getDepartmanAdi() {
		return departmanAdi;
	}

	public void setDepartmanAdi(String departmanAdi) {
		this.departmanAdi = departmanAdi;
	}

	public Set<Calisan> getCalisanlar() {
		return calisanlar;
	}

	public void setCalisanlar(Set<Calisan> calisanlar) {
		this.calisanlar = calisanlar;
	}
	
	

	
	
	
	
	
}

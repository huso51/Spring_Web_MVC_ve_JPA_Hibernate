package org.turkeyjug;

public class Araba {

	private Yakit yakit;
	
	public Araba(Yakit yakit) {
		this.yakit = yakit;
	}
	
	public void anahtariCevir() {
		yakit.bilgiAl();
		System.out.println("Araba calisiyor...");
	}
	
	
}

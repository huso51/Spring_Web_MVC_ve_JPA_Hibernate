package org.turkeyjug;

public class Araba {

	private Yakit yakit;
	
	public Araba() {
		this.yakit = new Yakit();
	}
	
	public void anahtariCevir() {
		yakit.bilgiAl();
		System.out.println("Araba calisiyor...");
	}
	
	
}

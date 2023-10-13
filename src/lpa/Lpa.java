package lpa;

import java.util.*;

public class Lpa {
	
	private ArrayList<Chocolat> lesChocolats;
	private ArrayList<Jardin> lesJardins;
	private Jardin monJardin;
	private Iterator<Jardin> iterJardins;
	
	public Lpa(ArrayList<Chocolat> lesChocolats, ArrayList<Jardin> lesJardins) {
		this.lesJardins = lesJardins;
		this.lesChocolats = lesChocolats;
		iterJardins = lesJardins.iterator();
		avancer();
	}
	
	public void deposerChocolatEnfant(Enfant e) {
	//A_ECRIRE
	}
	public void deposerChocolatJardin() {
	// A_ECRIRE
	}
	public boolean avancer() {
	// A_ECRIRE
	}
}

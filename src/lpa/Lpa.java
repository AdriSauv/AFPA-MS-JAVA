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
		if (monJardin == null) {
	        System.out.println("Le LPA est arrêté et ne peut pas déposer de chocolat.");
	        return;
	    }
		
		Iterator<Chocolat> it = lesChocolats.iterator();
	    while (it.hasNext()) {
	        Chocolat chocolat = it.next();
	        if (chocolat.convient(e)) {
	           
	            e.mangeChocolat(chocolat);
	            it.remove(); // Retire le chocolat du sac à dos
	            System.out.println("Le LPA a déposé un chocolat à " + e.getPrenom() + ".");
	            return; 
	    }
	    
	    System.out.println("Le LPA n'a pas trouvé de chocolat convenant à " + e.getPrenom() + ".");
	}
	
	
	public void deposerChocolatJardin() {
	// A_ECRIRE
	}
	
	
	public boolean avancer() {
		if(monJardin == null) {
			return false;
		}
		if(iterJardins.hasNext()) {
			return true;
		} else {
			monJardin = null;
	        return false;
		} 
	}
}

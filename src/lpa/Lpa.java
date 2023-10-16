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
		if (getMonJardin() == null) {
	        System.out.println("Le LPA est arrêté et ne peut pas déposer de chocolat.");
	        return;
	    }
		
		Iterator<Chocolat> it = lesChocolats.iterator();
	    while (it.hasNext()) {
	        Chocolat chocolat = it.next();
	        if (chocolat.convient(e)) {
	           
	            e.mangeChocolat(chocolat);
	            it.remove();
	            System.out.println("Le LPA a déposé un chocolat à " + e.getPrenom() + ".");
	            return; 
	    }
	        
	        System.out.println("Le LPA n'a pas trouvé de chocolat convenant à " + e.getPrenom() + ".");
	        
	    }
	    
	}
	    
	
	
	public void deposerChocolatJardin() {
		if (getMonJardin() == null) {
	        System.out.println("Le LPA est arrêté et ne peut pas déposer de chocolats.");
	        return;
	    }
		
		System.out.println("Le LPA dépose des chocolats dans le jardin : " + getMonJardin().getAdresse());
		
		Iterator<Enfant> enfantIterator = getMonJardin().getLesEnfantsIterator();

	    while (enfantIterator.hasNext()) {
	        Enfant enfant = enfantIterator.next();
	        deposerChocolatEnfant(enfant);
	    }
	}
	
	
	public boolean avancer() {
		if(getMonJardin() == null) {
			return false;
		}
		if(iterJardins.hasNext()) {
			return true;
		} else {
			monJardin = null;
	        return false;
		} 
	}

	public Jardin getMonJardin() {
		return monJardin;
	}
}

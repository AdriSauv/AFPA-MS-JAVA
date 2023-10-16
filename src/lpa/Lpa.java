package lpa;

import java.util.*;

public class Lpa {
	
	private List<Chocolat> lesChocolats;
	private List<Jardin> lesJardins;
	private Jardin monJardin;
	private Iterator<Jardin> iterJardins;
	private boolean arrete;
	
	public Lpa(List<Chocolat> lesChocolats, List<Jardin> lesJardins) {
		this.lesJardins = lesJardins;
		this.lesChocolats = lesChocolats;
		iterJardins = lesJardins.iterator();
		arrete = false;
		avancer();
	}
	
	
	public void deposerChocolatEnfant(Enfant e) {
		Iterator<Chocolat> it = lesChocolats.iterator();
		while (it.hasNext()) {
	        Chocolat chocolat = it.next();
	        
	        if (chocolat.convient(e)) {	            
	            e.mangeChocolat(chocolat);   
	            it.remove();
	            break;
	        }
	    }
		
	}
	
	public void deposerChocolatJardin() {
		if (monJardin == null) {
	        return;
	    }
		Iterator<Enfant> it = monJardin.getLesEnfantsIterator();
		while (it.hasNext()) {
	        Enfant enfant = it.next();
	        deposerChocolatEnfant(enfant);
	    }
	}
	
	public boolean avancer() {
		if (monJardin == null || !iterJardins.hasNext()) {
	        return false;
	    }
		monJardin = iterJardins.next();
		
		return true;
	}
	
}

package lpa;

import java.util.*;

public class Jardin {
	private String adresse;
	private List<Enfant> lesEnfants;
	
	
	public Jardin(String adresse){
		this.adresse = adresse;
		lesEnfants = new ArrayList<Enfant>();
	}
	
	public Iterator<Enfant> getLesEnfantsIterator(){
		return lesEnfants.iterator();
	}
	
	public String getAdresse() { 
		return adresse; 
	}
	
	public boolean ajouteEnfant(Enfant e){
		return lesEnfants.add(e);
	}
}

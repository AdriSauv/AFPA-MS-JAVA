package lpa;

public class Jardin {
	private String adresse;
	private A_COMPLETER lesEnfants;
	
	
	public Jardin(String adresse){
		this.adresse = adresse;
		lesEnfants = A_COMPLETER;
	}
	
	public Iterator getLesEnfantsIterator(){
		return lesEnfants.iterator();
	}
	
	public String getAdresse() { 
		return adresse; 
	}
	
	public boolean ajouteEnfant(Enfant e){
		return lesEnfants.add(e);
	}
}

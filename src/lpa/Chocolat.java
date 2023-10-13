package lpa;

public class Chocolat {
	public static final String LAPIN = "lapin";
	public static final String CLOCHE = "cloche";
	public static final String OEUF = "oeuf";
	public static final String POULE = "poule";
	private String nom;
	private float poids;
	
	public Chocolat(String nom, float poids){
		this.nom=nom;
		this.poids = poids;
	}
	
	public boolean convient(Enfant e) {
		float poidsEnfant = e.getPoids();
		float poidsChocolat = this.poids;
		float poidsAttendu = 1000.0f / poidsEnfant;
		
		//marge de 1%
		float marge = poidsAttendu*0.01f;
		
		return poidsChocolat >= (poidsAttendu - marge) && poidsChocolat <= (poidsAttendu + marge);
		
	}
}

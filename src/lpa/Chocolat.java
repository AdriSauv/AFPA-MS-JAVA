package lpa;

public class Chocolat {
	public static final String LAPIN = "lapin";
	public static final String CLOCHE = "cloche";
	public static final String OEUF = "oeuf";
	public static final String POULE = "poule";
	/** la forme du chocolat */
	private String nom;
	/** le poids du chocolat */
	private float poids;
	public Chocolat(String nom, float poids){
	this.nom=nom;
	this.poids = poids;
	}
	public boolean convient(Enfant e) {
	// A ECRIRE
	}
}

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
		double poidsChocolatMin = e.getPoids() * 1000 * 0.99;
	    double poidsChocolatMax = e.getPoids() * 1000 * 1.01;
	    return (poids >= poidsChocolatMin) && (poids <= poidsChocolatMax);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	
}

package mediatheque;

public class Membre {
	private String id, nom, prenom, adresse;

	public Membre(String id, String nom, String prenom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}
	
	
}

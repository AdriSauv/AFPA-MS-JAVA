package mediatheque;

import java.util.Date;

public class CD {
	private String code, titre, style, artiste;
	private Date retour;
	private Membre emprunteur;
	
	
	
	public CD(String code, String titre, String style, String artiste, Date retour, Membre emprunteur) {
		this.code = code;
		this.titre = titre;
		this.style = style;
		this.artiste = artiste;
		this.retour = retour;
		this.emprunteur = emprunteur;
	}
	
	

	public String getCode() {
		return code;
	}



	public String getTitre() {
		return titre;
	}



	public String getStyle() {
		return style;
	}



	public String getArtiste() {
		return artiste;
	}



	public Date getRetour() {
		return retour;
	}



	public Membre getEmprunteur() {
		return emprunteur;
	}



	public boolean estEmprunte() {
		return emprunteur!=null;
	}
	
	
	public void emprunter(Membre m) {
		emprunteur = m;
		retour = Date.currentDate().addDays(6);
	}
	
	
	public void rendre() {
		emprunteur = null;
		retour = null;
	}
	
	
	public boolean doitEtreRendu() {
		return Date.currentDate().compareTo(retour) <= 0;
	}
	
	
	
}

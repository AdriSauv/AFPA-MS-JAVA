package mediatheque;

import java.util.Date;

public class CD {
	private String code, titre, style, artiste;
	private Date retour;
	private Membre emprunteur;
	
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

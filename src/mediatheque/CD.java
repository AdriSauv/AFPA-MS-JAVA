package mediatheque;

import java.util.*;
import java.time.LocalDate;


public class CD {
	private String code, titre, style, artiste;
	private LocalDate retour;
	private Membre emprunteur;
	
	
	
	public CD(String code, String titre, String style, String artiste, LocalDate retour, Membre emprunteur) {
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



	public LocalDate getRetour() {
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
		LocalDate currentDate = LocalDate.now();
		retour = currentDate.plusDays(6);
	}
	
	
	public void rendre() {
		emprunteur = null;
		retour = null;
	}
	
	
	public boolean doitEtreRendu() {
	    LocalDate currentDate = LocalDate.now();
	    return currentDate.isBefore(retour) || currentDate.isEqual(retour);
	}
	
	
	
}

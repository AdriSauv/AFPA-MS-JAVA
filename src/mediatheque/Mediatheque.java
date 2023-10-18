package mediatheque;

import java.util.*;
import java.util.stream.Collectors;

public class Mediatheque {
	private Set<CD> cds;
	private Set<Membre> membres;
	
	public boolean peutEmprunter(Membre m) {
	    int empruntsActifs = 0;

	    for (CD cd : getCds()) {
	        if (cd.getEmprunteur() != null && cd.getEmprunteur().equals(m) && !cd.doitEtreRendu()) {
	            empruntsActifs++;
	        }
	    }

	    return empruntsActifs < 3;
	}

	
	public void emprunter (Membre m, CD cd) {
		if(peutEmprunter(m)) {
			if(!cd.estEmprunte()) {
				cd.emprunter(m);
			} else {
				System.out.println("CD déjà emprunté");
			}
		} else {
			System.out.println("Le membre ne peut pas emprunter de cd pour le moment.");
		}
	}
	
	
	public Set<CD> chercherParArtiste(String artiste){
		Set<CD> resultat = new HashSet<>();
		
		for (CD cd : getCds()) {
			if(cd.getArtiste().equalsIgnoreCase(artiste) ) {
				resultat.add(cd);
			}
		}
		return resultat;
		
	}
	
	
	public Set<CD> chercherParMotCle (String... motsClesDansLeTitre){
		Set<CD> resultat = new HashSet<>();
		
		for (String motCle : motsClesDansLeTitre) {
	        resultat.addAll(getCds().stream()
	                .filter(cd -> cd.getTitre().toLowerCase().contains(motCle.toLowerCase()))
	                .collect(Collectors.toSet()));
	    }
		
		return resultat;
		
	}


	public Set<CD> getCds() {
		return cds;
	}


	public void setCds(Set<CD> cds) {
		this.cds = cds;
	}


	public Set<Membre> getMembres() {
		return membres;
	}


	public void setMembres(Set<Membre> membres) {
		this.membres = membres;
	}
}

package mediatheque;

import java.util.Set;

public class Mediatheque {
	private Set<CD> cds;
	private Set<Membre> membres;
	
	public boolean peutEmprunter(Membre m) {
	    int empruntsActifs = 0;

	    for (CD cd : cds) {
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
	
	
	public Set<CD> chercherParArtiste (String artiste){};
	public Set<CD> chercherParMotCle (String... motsClesDansLeTitre){};
}

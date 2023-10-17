package mediatheque;

import java.util.Set;

public class Mediatheque {
	private Set<CD> cds;
	private Set<Membre> membres;
	
	public boolean peutEmprunter (Membre m);
	public void emprunter (Membre m, CD cd);
	public Set<CD> chercherParArtiste (String artiste);
	public Set<CD> chercherParMotCle (String...strings motsClesDansLeTitre);
}

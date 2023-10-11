package fleuriste;

import java.util.*;

public class Fleuriste{
	private List<Fleur> stockFleurs = new ArrayList<>();
	private Map<String, String> clients;
	
	
	public Fleuriste() {
        stockFleurs = new ArrayList<>();
        clients = new HashMap<>();
    }
	
	public int quantiteEnStock(String nomFleur) {
        for (Fleur fleur : stockFleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getQtx();
            }
        }
        return 0;
    }
	
	public double prixDUneFleur(String nomFleur) {
        for (Fleur fleur : stockFleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getPrix();
            }
        }
        return 0.0;
    }
}

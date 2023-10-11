package fleuriste;

import java.util.*;

public class Fleuriste{
	private List<Fleur> stockFleurs = new ArrayList<>();
	private Map<String, String> clients;
	private Bouquet bouquetEnCours;
	
	
	public Fleuriste() {
        stockFleurs = new ArrayList<>();
        clients = new HashMap<>();
    }
	
	public void creationBouquet(String nom, String prenom) {
        bouquetEnCours = new Bouquet(nom, prenom);
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
	
	public void ajoutFleur(String nomFleur, int qte) {
        if (bouquetEnCours != null) {
            int quantiteEnStock = quantiteEnStock(nomFleur);
            if (quantiteEnStock >= qte) {
                Fleur fleur = null;
                for (Fleur f : stockFleurs) {
                    if (f.getNom().equals(nomFleur)) {
                        fleur = f;
                        break;
                    }
                }
                bouquetEnCours.ajouterFleur(fleur, qte);
                // MaJ stock
                fleur.reduireStock(qte);
            } else {
                System.out.println("Stock insuffisant pour la fleur " + nomFleur);
            }
        } else {
            System.out.println("Aucun bouquet en cours de composition.");
        }
    }
}

package fleuriste;

import java.util.*;

public class Bouquet {
	private List<Fleur> fleurs;
	private List<Integer> quantites;
	private double prixTotal;
	private String nomClient;
    private String prenomClient;
    
    
    public Bouquet(String nomClient, String prenomClient) {
        fleurs = new ArrayList<>();
        quantites = new ArrayList<>();
        prixTotal = 0.0;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
    }
    
    public void ajouterFleur(Fleur fleur, int quantite) {
        fleurs.add(fleur);
        quantites.add(quantite);
        prixTotal += fleur.getPrix() * quantite;
    }
}

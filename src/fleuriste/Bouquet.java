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
    
    public void afficherFacture() {
        System.out.println("Facture pour " + nomClient + " " + prenomClient + ":");
        for (int i = 0; i < fleurs.size(); i++) {
            System.out.println(quantites.get(i) + " " + fleurs.get(i).getNom() + " - " + (quantites.get(i) * fleurs.get(i).getPrix()) + " €");
        }
        System.out.println("Prix total: " + prixTotal + " €");
    }
    
    public List<Fleur> getFleurs() {
        return fleurs;
        {

    public List<Integer> getQuantites() {
        return quantites;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }
}

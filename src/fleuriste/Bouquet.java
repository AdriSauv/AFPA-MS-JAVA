package fleuriste;

import java.util.*;

public class Bouquet {
	private List<Fleur> fleurs;
	private List<Integer> quantites;
	private double prixTotal;
	private Client client;
    
    
	public Bouquet(Client client) {
        this.client = client;
        fleurs = new ArrayList<>();
        quantites = new ArrayList<>();
        prixTotal = 0.0;
    }
    
    public void ajouterFleur(Fleur fleur, int quantite) {
        fleurs.add(fleur);
        quantites.add(quantite);
        prixTotal += fleur.getPrix() * quantite;
    }
    
    
    public String genererFacture() {
        StringBuilder facture = new StringBuilder();
        facture.append("Facture pour " + client.getNom() + " " + client.getPrenom() + " :\n");
        for (int i = 0; i < fleurs.size(); i++) {
            facture.append(quantites.get(i) + " " + fleurs.get(i).getNom() + " - " + (quantites.get(i) * fleurs.get(i).getPrix()) + " €\n");
        }
        facture.append("Prix total : " + prixTotal + " €\n");
        return facture.toString();
    }
    
    
    public void afficherFacture() {
        System.out.println("Facture pour " + client.getNom() + " " + client.getPrenom() + ":");
        for (int i = 0; i < fleurs.size(); i++) {
            System.out.println(quantites.get(i) + " " + fleurs.get(i).getNom() + " - " + (quantites.get(i) * fleurs.get(i).getPrix()) + " €");
        }
        System.out.println("Prix total: " + prixTotal + " €");
    }
    
    public List<Fleur> getFleurs() {
        return fleurs;
    }

    public List<Integer> getQuantites() {
        return quantites;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public Client getClient() {
        return client;
    }
}

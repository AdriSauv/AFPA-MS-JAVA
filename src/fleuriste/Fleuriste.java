package fleuriste;

import java.util.*;

public class Fleuriste implements InterfaceFleuriste {
    private List<Fleur> stockFleurs = new ArrayList<>();
    private Map<String, Client> clients = new HashMap<>();
    private List<Bouquet> bouquetsCommandes = new ArrayList<>();
    private Bouquet bouquetEnCours;

    public Fleuriste() {
        stockFleurs = new ArrayList<>();
        clients = new HashMap<>();
    }

    public void creationBouquet(String nom, String prenom) {
        if (bouquetEnCours == null) {
            Client client = new Client(nom, prenom);
            bouquetEnCours = new Bouquet(client);
        } else {
            System.out.println("Un bouquet est déjà en cours de composition.");
        }
    }

    public int quantiteEnStock(String nomFleur) {
        for (Fleur fleur : stockFleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getQtx();
            }
        }
        return 0;
    }

    public float prixDUneFleur(String nomFleur) {
        for (Fleur fleur : stockFleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur.getPrix();
            }
        }
        return 0.0f;
    }
    
    
    private Fleur trouverFleurDansStock(String nomFleur) {
        for (Fleur fleur : stockFleurs) {
            if (fleur.getNom().equals(nomFleur)) {
                return fleur;
            }
        }
        return null;
    }
    
    public void ajoutFleur(String nomFleur, int qte) {
        if (bouquetEnCours == null) {
            System.out.println("Aucun bouquet en cours de composition.");
            return;
        }

        Fleur fleur = trouverFleurDansStock(nomFleur);
        if (fleur == null) {
            System.out.println("Fleur non trouvée dans le stock : " + nomFleur);
            return;
        }

        int quantiteEnStock = fleur.getQtx();
        if (quantiteEnStock >= qte) {
            bouquetEnCours.ajouterFleur(fleur, qte);
            fleur.setQtx(quantiteEnStock - qte); // Update the flower's quantity in stock
        } else {
            System.out.println("Stock insuffisant pour la fleur " + nomFleur);
        }
    }

    public void facturation() {
        if (bouquetEnCours != null) {
            String facture = bouquetEnCours.genererFacture();
            System.out.println(facture);
            bouquetsCommandes.add(bouquetEnCours);
            clients.put(bouquetEnCours.getClient().getNom() + " " + bouquetEnCours.getClient().getPrenom(), bouquetEnCours.getClient());
            bouquetEnCours = null;
        } else {
            System.out.println("Aucun bouquet en cours de composition.");
        }
    }
}

package Livre;

import java.util.ArrayList;
import java.util.List;

public class Bibliobus {
	// Attributs
	private String nom;
	private int capaciteMax;
	private List<Livre> catalogue;
	
	// Constructeur par défaut (capacité par défaut de 100)
    public Bibliobus(String nom) {
        this.nom = nom;
        this.capaciteMax = 100;
        this.catalogue = new ArrayList<>();
    }
	
    // Constructeur avec capacité spécifiée
    public Bibliobus(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.catalogue = new ArrayList<>();
    }
    
    public void ajoutLivre(String titre, String auteur, String editeur) {
        if (catalogue.size() < capaciteMax) {
            Livre nouveauLivre = new Livre(titre, auteur, editeur, 0, "Non spécifié");
            catalogue.add(nouveauLivre);
            System.out.println("Livre ajouté au catalogue :");
            nouveauLivre.afficherInformations();
        } else {
            System.out.println("Le bibliobus est plein. Impossible d'ajouter un nouveau livre.");
        }
    }
    
    public void afficheCatalogue() {
        System.out.println("Nom du bibliobus : " + nom);
        System.out.println("Catalogue du bibliobus :");

        for (Livre livre : catalogue) {
            livre.afficherInformations();
        }
    }
    
    public String getTitre(int position) {
        if (position >= 0 && position < catalogue.size()) {
            return catalogue.get(position).getTitre();
        }
        return "Livre non trouvé dans le catalogue du bibliobus.";
    }
    
    public String getAuteur(int position) {
        if (position >= 0 && position < catalogue.size()) {
            return catalogue.get(position).getAuteur();
        }
        return "Livre non trouvé dans le catalogue du bibliobus.";
    }
    
    public String getEditeur(int position) {
        if (position >= 0 && position < catalogue.size()) {
            return catalogue.get(position).getEditeur();
        }
        return "Livre non trouvé dans le catalogue du bibliobus.";
    }
    
    public String getGenre(int position) {
        if (position >= 0 && position < catalogue.size()) {
            return catalogue.get(position).getGenre();
        }
        return "Livre non trouvé dans le catalogue du bibliobus.";
    }
    
    public int getNbExemplaires(int position) {
        if (position >= 0 && position < catalogue.size()) {
            return catalogue.get(position).getNombreExemplaires();
        }
        return 0; // Livre non trouvé ou non disponible
    }
}

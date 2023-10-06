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
    
    // Méthode pour ajouter un livre au catalogue
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
}

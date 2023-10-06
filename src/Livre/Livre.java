package Livre;

public class Livre {
    // Attributs
    private String titre;
    private String auteur;
    private String editeur;
    private int nombreExemplaires;
    private String genre;

    // Constructeur
    public Livre(String titre, String auteur, String editeur, int nombreExemplaires, String genre) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.nombreExemplaires = nombreExemplaires;
        this.genre = genre;
    }
    
    // Constructeur avec genre non specifié
    public Livre(String titre, String auteur, String editeur, int nombreExemplaires) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.nombreExemplaires = (nombreExemplaires >= 0) ? nombreExemplaires : 0;
        this.genre = "Non spécifié"; 
    }

    // Méthode pour ajouter un exemplaire
    public void nouvelExemplaire(int nombre) {
        if (nombre > 0) {
            this.nombreExemplaires += nombre;
        }
    }

    // Méthode pour signaler la perte d'un exemplaire
    public void perteExemplaire() {
        if (this.nombreExemplaires > 0) {
            this.nombreExemplaires--;
        }
    }

    // Méthode pour vérifier si le livre est présent dans la bibliothèque
    public boolean estPresent() {
        return this.nombreExemplaires > 0;
    }

    // Méthode pour afficher les informations du livre
    public void afficherInformations() {
        System.out.println("Titre : " + this.titre);
        System.out.println("Auteur : " + this.auteur);
        System.out.println("Éditeur : " + this.editeur);
        System.out.println("Nombre d'exemplaires : " + this.nombreExemplaires);
        System.out.println("Genre : " + this.genre);
    }

    // Méthode pour vérifier si deux livres représentent la même œuvre
    public boolean memeOeuvre(Livre autreLivre) {
        return this.titre.equals(autreLivre.titre) &&
               this.auteur.equals(autreLivre.auteur) &&
               this.editeur.equals(autreLivre.editeur);
    }

    // Méthode pour changer d'éditeur
    public Livre nouvelEditeur(String nouveauEditeur) {
        return new Livre(this.titre, this.auteur, nouveauEditeur, this.nombreExemplaires, this.genre);
    }
}


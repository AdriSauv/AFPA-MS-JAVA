package Livre;

public class DemoLivre {
	public static void main(String[] args) {
        
        Livre livre1 = new Livre("Titre 1", "Auteur 1", "Éditeur 1", 3, "Littérature française");
        Livre livre2 = new Livre("Titre 2", "Auteur 2", "Éditeur 2", 2, "Policier");

        
        livre1.afficherInformations();
        livre2.afficherInformations();

        
        System.out.println("Livre 1 présent : " + livre1.estPresent());
        System.out.println("Livre 2 présent : " + livre2.estPresent());

        
        System.out.println("Livre 1 et Livre 2 représentent la même œuvre : " + livre1.verifierMemeOeuvre(livre2));

       
        Livre livre3 = livre1.changerEditeur("Nouvel Éditeur");
        livre3.afficherInformations();
    }
}

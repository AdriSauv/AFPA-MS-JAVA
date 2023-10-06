package Livre;

public class DemoLivre {
	public static void main(String[] args) {
        
        Livre livre1 = new Livre("Harry Potter and the Goblet of Fire", "J.K Rowling", "A Levine", 3, "Fantasy");
        Livre livre2 = new Livre("Bayard et le Crime d'Amboise", "Eric Fouassier", "Lizzie", 2, "Thriller");

        
        livre1.afficherInformations();
        livre2.afficherInformations();

        
        System.out.println("Livre 1 présent : " + livre1.estPresent());
        System.out.println("Livre 2 présent : " + livre2.estPresent());

        
        System.out.println("Livre 1 et Livre 2 représentent la même œuvre : " + livre1.memeOeuvre(livre2));

       
        Livre livre3 = livre1.nouvelEditeur("Nouvel Éditeur");
        livre3.afficherInformations();
    }
}

package Livre;

public class DemoBibliobus {
	public static void main(String[] args) {
		Bibliobus bibliobus = new Bibliobus("Bibliobus A");
        
        bibliobus.ajoutLivre("Harry Potter Et La Chambre Des Secrets", "J.K Rowling", "A Levine");
        bibliobus.ajoutLivre("Harry Potter Et La Coupe De Feu", "J.K Rowling", "A Levine");
        bibliobus.afficheCatalogue();
        
        String titreLivre1 = bibliobus.getTitre(1);
        System.out.println("Titre du premier livre : " + titreLivre1);
	}
}

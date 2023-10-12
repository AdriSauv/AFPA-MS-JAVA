package fleuriste;

public class DemoFleuriste {
    public static void main(String[] args) {
       
        Fleuriste fleuriste = new Fleuriste();
        Fleur rose = new Fleur("Rose", 3.50f, 14);
        Fleur tulipe = new Fleur("Tulipe", 2.21f, 18);
        Fleur tournesol = new Fleur("Tournesol", 1.81f, 8);
        
        
        Client client1 = new Client("Charlie", "Brown");
        Bouquet bouquet = new Bouquet(client1);
        
        fleuriste.creationBouquet("Charlie", "Brown");
        bouquet.ajouterFleur(tournesol, 2);
        bouquet.ajouterFleur(rose, 5);
        bouquet.ajouterFleur(tulipe, 3);
        
        

        System.out.println(bouquet.genererFacture());
        
    }
}


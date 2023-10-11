package fleuriste;

public class DemoFleuriste {
    public static void main(String[] args) {
       
        Fleuriste fleuriste = new Fleuriste();

        
        fleuriste.creationBouquet("Charlie", "Brown");

        
        fleuriste.ajoutFleur("Rose", 3);
        fleuriste.ajoutFleur("Tulipe", 5);

        
        fleuriste.facturation();
    }
}


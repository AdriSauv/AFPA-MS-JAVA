package lpa;
import java.util.*;

public class PascalLeLapin {
	public static void main(String[] args) {
        
		Chocolat chocolat1 = new Chocolat(Chocolat.LAPIN, 2);
        Chocolat chocolat2 = new Chocolat(Chocolat.OEUF, 1);
        Chocolat chocolat3 = new Chocolat(Chocolat.POULE, 4);
        
        Enfant enfant1 = new Enfant("Emilia", 15);
        Enfant enfant2 = new Enfant("Sofyia", 14);
        Enfant enfant3 = new Enfant("Jules", 11);
        Enfant enfant4 = new Enfant("Jack", 19);

        Jardin jardin1 = new Jardin("Jardin 1");
        Jardin jardin2 = new Jardin("Jardin 2");
        
        
        jardin1.ajouteEnfant(enfant1);
        jardin1.ajouteEnfant(enfant2);
        jardin2.ajouteEnfant(enfant3);
        jardin2.ajouteEnfant(enfant4);
        
        List<Chocolat> chocolats = new ArrayList<>();
        chocolats.add(chocolat1);
        chocolats.add(chocolat2);
        chocolats.add(chocolat3);
        
        List<Jardin> jardins = new ArrayList<>();
        jardins.add(jardin1);
        jardins.add(jardin2);
        
        Lpa lpa = new Lpa(chocolats, jardins);
        
		List<Lpa> lesLPA = new ArrayList<>();
		lesLPA.add(lpa);
		
		
		for (Jardin jardin : jardins) {
			System.out.println("\nAdresse: " + jardin.getAdresse());
            System.out.println("Enfants dans le jardin:");
            Iterator<Enfant> childrenIterator = jardin.getLesEnfantsIterator();
            while (childrenIterator.hasNext()) {
                Enfant enfant = childrenIterator.next();
                System.out.println("   Prénom: " + enfant.getPrenom() + ", Poids: " + enfant.getPoids());
            }
		}
		
		lpa.getLesJardins();
		lpa.avancer();
		lpa.deposerChocolatJardin();
		lpa.deposerChocolatEnfant(enfant1);   
	}
	
}

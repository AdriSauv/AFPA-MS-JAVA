package lpa;
import java.util.*;

public class PascalLeLapin {
	public static void main(String[] args) {
        
		Set<Lpa> mesLPA = new HashSet<>();
		
		Lpa lpa1 = createLPA();
        Lpa lpa2 = createLPA();
		
		
        mesLPA.add(lpa1);
        mesLPA.add(lpa2);
        
        
        for (Lpa lpa : mesLPA) {
            runLPA(lpa);
        }  
		
    }
	
	private static Lpa createLPA() {
	    
	    Chocolat chocolat1 = new Chocolat(Chocolat.LAPIN, 50);
	    Chocolat chocolat2 = new Chocolat(Chocolat.OEUF, 30);
	    Chocolat chocolat3 = new Chocolat(Chocolat.CLOCHE, 40);

	   
	    Enfant enfant1 = new Enfant("Alice", 25);
	    Enfant enfant2 = new Enfant("Bob", 30);
	    Enfant enfant3 = new Enfant("Charlie", 35);

	   
	    Jardin jardin1 = new Jardin("142 rue Emile");
	    jardin1.ajouteEnfant(enfant1);
	    jardin1.ajouteEnfant(enfant2);

	    Jardin jardin2 = new Jardin("2 rue Quasimir");
	    jardin2.ajouteEnfant(enfant3);

	    ArrayList<Jardin> lesJardins = new ArrayList<>();
	    lesJardins.add(jardin1);
	    lesJardins.add(jardin2);

	    ArrayList<Chocolat> lesChocolats = new ArrayList<>();
	    lesChocolats.add(chocolat1);
	    lesChocolats.add(chocolat2);
	    lesChocolats.add(chocolat3);

	    return new Lpa(lesChocolats, lesJardins);
	}
	
	private static void runLPA(Lpa lpa) {
        boolean finished = false;
        while (!finished) {
        	finished = true;
            if (lpa.avancer()) {
                lpa.deposerChocolatJardin();
                finished = false;
            }
        }
    }
	
	
}

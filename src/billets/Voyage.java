package billets;
import java.util.*;


public class Voyage {
	private String nom;
    private String prenom;
    private ArrayList<Billets> billets = new ArrayList<>();
    
    public Voyage(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public void ajoutReservationTrain(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction){
        if (billets.size() < 10) {
            BilletTrain train = new BilletTrain(departCity, arrivalCity, kilometres, nbPersonnes, reduction);
            billets.add(train);
        }
    }
    
    public void ajoutReservationAvion(String villeDepart, String villeDestination, int distanceEnKilometres, int nombreDePersonnes, float reduction) {
        if (billets.size() < 10) {
            BilletAvion avion = new BilletAvion(villeDepart, villeDestination, distanceEnKilometres, nombreDePersonnes, reduction);
            billets.add(avion);
        }
    }
    
    public double calculerCoutTotal() {
        double coutTotal = 0;
        for (Billets billet : billets) {
            coutTotal += billet.calculerPrix();
        }
        return coutTotal;
    }
    
    @Override
    public String toString() {
        String output = "Voyage de " + prenom + " " + nom + "\n";
        for (Billets billet : billets) {
            output += billet.afficherBillet() + "\n";
        }
        output += "Total : " + calculerCoutTotal() + " euros";
        return output;
    }
}

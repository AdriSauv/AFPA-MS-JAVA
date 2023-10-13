package billets;

public class BilletTrain extends Billets {
	protected float prixKm = 0.10f;
	
	public BilletTrain(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction, float prixKm, int taxe) {
		super(departCity, arrivalCity, kilometres, nbPersonnes, reduction);
		this.prixKm = prixKm;
	}
	
	
	public float prixBillet() {
		float result = ((kilometres * prixKm) * nbPersonnes);
		return result;
	}
	
	@Override
	public String toString() {
		return "BilletTrain [Nombre de personne : " + getNbPersonnes() + 
				", Ville de départ :  " + getDepartCity() + 
				", Ville d'arrivée : " + getArrivalCity() + 
				", kilomètres : " + getKilometres() + 
				", prix total : " + prixBillet();
	}
}

package billets;

public class BilletTrain extends Billets {
	
	public BilletTrain(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction, float prixKm) {
		super(departCity, arrivalCity, kilometres, nbPersonnes, reduction);
	}
	
	@Override
	public double calculerPrix() {
		return 0.10 * kilometres * nbPersonnes * (1-reduction);
	}
	
}

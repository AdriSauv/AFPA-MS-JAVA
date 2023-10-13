package billets;

public class BilletAvion extends Billets {
	
	public BilletAvion(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction) {
		super(departCity, arrivalCity, kilometres, nbPersonnes, reduction);
	}
	
	@Override
	public double calculerPrix() {
		return  0.20 * kilometres * nbPersonnes * (1 - reduction) + 20;
	}
}

package billets;

public class BilletAvion extends Billets {
	protected float prixKm = 0.20f;
	protected int taxe = 20;
	
	public BilletAvion(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction, float prixKm, int taxe) {
		super(departCity, arrivalCity, kilometres, nbPersonnes, reduction);
		this.prixKm = prixKm;
		this.taxe = taxe;
	}
	
	
	public float prixBillet() {
		float result = ((kilometres * prixKm) * nbPersonnes) + taxe;
		return result;
	}


	@Override
	public String toString() {
		return "BilletAvion [prixBillet()=" + prixBillet() + "]";
	}
	
	
	
}

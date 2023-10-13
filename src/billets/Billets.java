package billets;

public class Billets {
	protected String departCity;
	protected String arrivalCity;
	protected int kilometres;
	protected int nbPersonnes;
	protected float reduction;
	
	
	
	public Billets(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction) {
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.kilometres = kilometres;
		this.nbPersonnes = nbPersonnes;
		this.reduction = (reduction >= 0 && reduction <= 100) ? reduction : 0;
	}


	public double calculerPrix() {
		return 0;
	}
	
	
	public String afficherBillet() {
		return "Billet de " + departCity + " à " + arrivalCity + ", " + kilometres + " km," +
				nbPersonnes + "personne(s), réduction de " + (reduction*100) + "%, prix : " + calculerPrix() + "€.";
	}
}

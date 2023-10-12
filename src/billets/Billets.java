package billets;

public class Billets {
	private String departCity;
	private String arrivalCity;
	private int kilometres;
	private int nbPersonnes;
	private float reduction;
	
	
	public Billets(String departCity, String arrivalCity, int kilometres, int nbPersonnes) {
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.kilometres = kilometres;
		this.nbPersonnes = nbPersonnes;
	}
	
	public Billets(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction) {
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.kilometres = kilometres;
		this.nbPersonnes = nbPersonnes;
		this.reduction = reduction;
	}


	public String getDepartCity() {
		return departCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public int getKilometres() {
		return kilometres;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public float getReduction() {
		return reduction;
	}

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}
	
	public double prixBillet() {
		int taxAeroport = 20;
		double prixBillet = this.kilometres*0.20 + taxAeroport;
		return prixBillet;
	}
	
}

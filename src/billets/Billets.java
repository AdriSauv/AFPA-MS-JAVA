package billets;

public class Billets {
	protected String departCity;
	protected String arrivalCity;
	protected int kilometres;
	protected int nbPersonnes;
	protected float reduction;
	
	
	
	public Billets(String departCity, String arrivalCity, int kilometres, int nbPersonnes) {
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.kilometres = kilometres >= 0 ? kilometres : 0;
		this.nbPersonnes = nbPersonnes > 0 ? nbPersonnes : 1;
	}
	
	public Billets(String departCity, String arrivalCity, int kilometres, int nbPersonnes, float reduction) {
		this.departCity = departCity;
		this.arrivalCity = arrivalCity;
		this.kilometres = kilometres;
		this.nbPersonnes = nbPersonnes;
		this.reduction = (reduction >= 0 && reduction <= 100) ? reduction : 0;
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
		this.reduction = (reduction >= 0 && reduction <= 100) ? reduction : 0;
	}
	
	
	
}

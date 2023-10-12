package billets;

public class Billets {
	private String departCity;
	private String arrivalCity;
	private int kilometres;
	private int nbPersonnes;
	private float reduction;
	
	private static final double TRAIN_PRICE_PER_KILOMETER = 0.10;
    private static final double AIRPLANE_PRICE_PER_KILOMETER = 0.20;
    private static final int AIRPORT_TAX = 20;
	
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
	
	
	private boolean isAirplaneTicket() {
        
    }
	
	public double prixBillet() {
        double pricePerKilometer = (kilometres > 0) ? 
            ((kilometres * (isAirplaneTicket() ? AIRPLANE_PRICE_PER_KILOMETER : TRAIN_PRICE_PER_KILOMETER)) * nbPersonnes) :
            0.0;
        return pricePerKilometer + (isAirplaneTicket() ? AIRPORT_TAX : 0);
    }
	
	
	
}

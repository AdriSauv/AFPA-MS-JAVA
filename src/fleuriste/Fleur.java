package fleuriste;

public class Fleur {
	
	private String nom;
	private double prix;
	private int qtx;
	
	public Fleur(String nom, double prix, int qtx) {
		this.nom = nom;
		this.prix = prix;
		this.qtx = qtx;
	}

	public String getNom() {
		return nom;
	}

	public double getPrix() {
		return prix;
	}

	public int getQtx() {
		return qtx;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setQtx(int qtx) {
		this.qtx = qtx;
	}

	public void reduireStock(int qtxVendue) {
		qtx -= qtxVendue;
	}
}

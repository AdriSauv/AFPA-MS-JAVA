package fleuriste;

public class Fleurs {
	
	private String nom;
	private double prix;
	private int qtx;
	
	public Fleurs(String nom, double prix, int qtx) {
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
	
	public void reduireStock(int qtxVendue) {
		qtx -= qtxVendue;
	}
}

package fleuriste;

public class Fleur {
	
	private String nom;
	private float prix;
	private int qtx;
	
	public Fleur(String nom, float prix, int qtx) {
		this.nom = nom;
		this.prix = prix;
		this.qtx = qtx;
	}

	public String getNom() {
		return nom;
	}

	public float getPrix() {
		return prix;
	}

	public int getQtx() {
		return qtx;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public void setQtx(int qtx) {
		this.qtx = qtx;
	}

	public void reduireStock(int quantiteVendue) {
        if (quantiteVendue <= qtx) {
            qtx -= quantiteVendue;
        } else {
            System.out.println("Quantité insuffisante en stock pour " + nom);
        }
    }
}

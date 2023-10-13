package billets;

public class DemoBillet {
	public static void main(String[] args) {
		BilletAvion billet1 = new BilletAvion("Paris", "Lyon", 400, 5, 0, 0.20f, 20);
		
		billet1.prixBillet();
		System.out.println(billet1.toString());
	}
}

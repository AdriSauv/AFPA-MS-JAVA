package billets;

public class DemoBillet {
	public static void main(String[] args) {
		Voyage voy = new Voyage("Dupont","Pierre");

		voy.ajoutReservationTrain("Paris","Perpignan",850,4,0.25f);

		voy.ajoutReservationAvion("Perpignan","Palavas-les-flots",56,2,0);
		
		System.out.println(voy);
		
	}
}

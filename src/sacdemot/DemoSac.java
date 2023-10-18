package sacdemot;

public class DemoSac {
	public static void main(String[] a) {
		
		SacDeMots sac1 = new SacDeMots();
		
		sac1.ajouteUnMot("Soleil");
		
		System.out.println(sac1.toString());
		
		sac1.supprimeUnMot("Soleil");
		System.out.println(sac1.toString());
	}
}

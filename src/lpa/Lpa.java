package lpa;

public class Lpa {
	
	private A_COMPLETER lesChocolats;
	private A_COMPLETER lesJardins;
	private Jardin monJardin;
	private Iterator iterJardins;
	
	public LPA(A_COMPLETER lesChocolats, A_COMPLETER lesJardins) {
		this.lesJardins = lesJardins;
		this.lesChocolats = lesChocolats;
		iterJardins = lesJardins.iterator();
		avancer();
	}
	
	public void deposerChocolatEnfant(Enfant e) {
	//A_ECRIRE
	}
	public void deposerChocolatJardin() {
	// A_ECRIRE
	}
	public boolean avancer() {
	// A_ECRIRE
	}
}

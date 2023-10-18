package sacdemot;

import java.util.*;

public class SacDeMots {
	
	private Map<String, Integer> motOccurrences;

	public SacDeMots() {
		motOccurrences = new HashMap<>();
	}
	
	public void ajouteUnMot(String mot) {
        motOccurrences.put(mot, motOccurrences.getOrDefault(mot, 0) + 1);
    }

	@Override
	public String toString() {
		return "SacDeMots [motOccurrences=" + motOccurrences + "]";
	}
	
	
}

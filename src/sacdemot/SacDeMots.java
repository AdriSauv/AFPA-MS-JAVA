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
	
	public void supprimeUnMot(String mot) {
        Integer occurrences = motOccurrences.get(mot);
        if (occurrences != null) {
            if (occurrences > 1) {
                motOccurrences.put(mot, occurrences - 1);
            } else {
                motOccurrences.remove(mot);
            }
        }
    }
}

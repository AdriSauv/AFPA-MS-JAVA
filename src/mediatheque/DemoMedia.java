package mediatheque;
import java.time.LocalDate;
import java.util.*;

public class DemoMedia {
	public static void main(String[] a) {
		
		Membre membre1 = new Membre("1", "Adrien", "Wild", "142 rue Emile");
        Membre membre2 = new Membre("2", "Agus", "Soli", "142 rue Emile");
		
        CD cd1 = new CD("CD001", "Album 1", "Rock", "Artist 1", LocalDate.now(), null);
        CD cd2 = new CD("CD002", "Album 2", "Pop", "Artist 2", LocalDate.now(), null);
        CD cd3 = new CD("CD003", "Album 3", "Jazz", "Artist 1", LocalDate.now(), null);
        
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.setCds(new HashSet<>());
        mediatheque.setMembres(new HashSet<>());
        
        mediatheque.getMembres().add(membre1);
        mediatheque.getMembres().add(membre2);
        mediatheque.getCds().add(cd1);
        mediatheque.getCds().add(cd2);
        mediatheque.getCds().add(cd3);
        
        System.out.println("Membre 1 peut il emprunter un CD? " + mediatheque.peutEmprunter(membre1));
        System.out.println("Membre 2 peut elle emprunter un CD? " + mediatheque.peutEmprunter(membre2));
        
        mediatheque.emprunter(membre1, cd1);
        System.out.println("Le CD1 est il emprunté par Membre 1 ?" + cd1.getEmprunteur().equals(membre1));
        
        
        Set<CD> artiste1CDs = mediatheque.chercherParArtiste("Artiste 1");
        System.out.println("CDs de l Artiste 1: " + artiste1CDs);
        
        Set<CD> keywordCDs = mediatheque.chercherParMotCle("Album 2", "Album 3");
        System.out.println("CD avec 'Album 2' ou 'Album 3' dans le titre: " + keywordCDs.toString());
              
        
	}
}

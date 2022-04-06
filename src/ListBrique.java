import java.awt.List;
import java.awt.Panel;

public class ListBrique extends Panel {
	List maListe;
	
	public ListBrique(Modele m) {
		maListe = new List(20);
		
		for (Brique b : m.bibliotheque) {
			maListe.add(b.nomBrique);
		}
		
		this.add(this.maListe);
	}
}

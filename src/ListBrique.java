import java.awt.List;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ListBrique extends Panel implements Observer{
	List maListe;
	
	public ListBrique(Modele m) {
		maListe = new List(20);
		m.addObserver(this);
		for (Brique b : m.bibliotheque) {
			maListe.add(b.nomBrique);
			
		}
		
		this.add(this.maListe);
	}
	public void resRecherche(ArrayList<Brique> list) {
		this.maListe.clear();
		for (Brique b : list) {
			this.maListe.add(b.nomBrique);
		}
	}
	@Override
	public void update(Observable o, Object arg0) {
		try {
			resRecherche((ArrayList<Brique>) arg0);
		}
		catch(Exception e){
			
		}
		
	}
}

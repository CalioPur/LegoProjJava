
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Modele extends Observable{

	public List<Brique> bibliotheque;
	int indexBriqueSelect;
	
	public Modele() {
		this.bibliotheque = new ArrayList<>();
		//TODO Xochil : désérialise le fichier JSON stp
		this.bibliotheque.add(new Brique("2x2", 100, 2, 2, 1, Color.red));
		this.bibliotheque.add(new Brique("4x2", 101, 4, 2, 1, Color.green));
		this.bibliotheque.add(new Brique("6x2", 102, 6, 2, 1, Color.blue));
		this.bibliotheque.add(new Brique("2x2x3", 103, 2, 2, 3, Color.pink));
		this.bibliotheque.add(new Brique("1x1", 104, 1, 1, 1, Color.orange));
		this.bibliotheque.add(new Brique("3x1", 104, 3, 1, 1, Color.magenta));
	}
	
	public void deserialisation() {
		
	}

	public void doSomething() {
		// TODO plus tard quand on saura quoi faire
		
	}

	public void nouvelleBriqueSelectionnee(Object item) {
		indexBriqueSelect = (int)item;
		this.setChanged();
		this.notifyObservers(this.bibliotheque.get(this.indexBriqueSelect));
	}
}

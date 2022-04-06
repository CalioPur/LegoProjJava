
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Modele extends Observable{

	public List<Brique> bibliothèque;
	
	public Modele() {
		this.bibliothèque = new ArrayList<>();
		//TODO Xochil : désérialise le fichier JSON stp
		this.bibliothèque.add(new Brique("2x2", 100, 2, 2, 1, null));
		this.bibliothèque.add(new Brique("4x2", 101, 4, 2, 1, null));
	}

	public void doSomething() {
		// TODO plus tard quand on saura quoi faire
		
	}

	public void nouvelleBriqueSelectionnee(Object item) {
		int indexBriqueSelect = (int)item;
		//TODO Il faut mettre à jour le modèle
	}
}

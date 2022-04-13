
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Modele extends Observable{

	public ArrayList<Brique> bibliotheque;
	public ArrayList<Brique> maListAffiche;
	int indexBriqueSelect;
	int angleVue = 0;
	
	public Modele() {
		this.bibliotheque = new ArrayList<>();
		//TODO Xochil : désérialise le fichier JSON stp
		this.bibliotheque.add(new Brique("2x2", 100, 2, 2, 1, Color.red));
		this.bibliotheque.add(new Brique("4x2", 101, 4, 2, 1, Color.green));
		this.bibliotheque.add(new Brique("6x2", 102, 6, 2, 1, Color.blue));
		this.bibliotheque.add(new Brique("2x2x3", 103, 2, 2, 3, Color.pink));
		this.bibliotheque.add(new Brique("1x1", 104, 1, 1, 1, Color.orange));
		this.bibliotheque.add(new Brique("3x1", 104, 3, 1, 1, Color.magenta));
		this.maListAffiche=this.bibliotheque;
	}
	
	public void deserialisation() {
		//pense a mettre maListAffiche = bibliotheque apres la deserialisation stp
	}


	public void nouvelleBriqueSelectionnee(Object item) {
		indexBriqueSelect = (int)item;
		this.setChanged();
		this.notifyObservers(this.maListAffiche.get(this.indexBriqueSelect));
	}

	public void prochainAngleVue() {
		angleVue++;
		if (angleVue>6) {
			angleVue = 0;
		}
		this.setChanged();
		this.notifyObservers(angleVue);
	}

	public void precedentAngleVue() {
		angleVue--;
		if (angleVue<0) {
			angleVue = 6;
		}
		this.setChanged();
		this.notifyObservers(angleVue);
	}

	public void actuList(String text) {
		maListAffiche = new ArrayList<Brique>();
		for(Brique piece : bibliotheque) {
			if(piece.nomBrique.contains(text)) {
				this.maListAffiche.add(piece);
				System.out.println(piece.nomBrique);
			}
		}
		System.out.println();
		this.setChanged();
		this.notifyObservers(maListAffiche);
	}
}

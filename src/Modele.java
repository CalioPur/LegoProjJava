
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Modele extends Observable{
	String elmtCompare = "name";
	String textTyped = "";
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
		this.bibliotheque.add(new Brique("4x4", 105, 4, 4, 1, Color.orange));
		this.bibliotheque.add(new Brique("4x4x4", 105, 4, 4, 4, Color.yellow));
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

	public void prochainAngleVue(int ang) {
		angleVue=ang;
		this.setChanged();
		this.notifyObservers(angleVue);
	}
	
	public void chmtTag(String elmt){
		elmtCompare = elmt;
		actuList(textTyped);
	}
	
	public void actuList(String text) {
		textTyped = text;
		maListAffiche = new ArrayList<Brique>();
		for(Brique piece : bibliotheque) {
			if(elmtCompare == "name") {
				if(piece.nomBrique.contains(text)) {
					this.maListAffiche.add(piece);
				}
			}
			if(elmtCompare == "id") {
				String strId = String.valueOf(piece.IdBrique);
				if(strId.contains(text)) {
					this.maListAffiche.add(piece);
					System.out.println(piece.nomBrique);
				}
			}
			if(elmtCompare == "color") {
				String strCol = new String();
				ColorUtils colScript = new ColorUtils();
				strCol = colScript.getColorNameFromColor(piece.color);
				if(strCol.contains(text)) {
					this.maListAffiche.add(piece);
					System.out.println(piece.nomBrique);
				}
			}
		}
		System.out.println();
		this.setChanged();
		this.notifyObservers(maListAffiche);
	}
}

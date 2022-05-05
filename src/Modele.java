
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.swing.text.Position;


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
		textTyped = text.toLowerCase();
		maListAffiche = new ArrayList<Brique>();
		for(Brique piece : bibliotheque) {
			if(elmtCompare == "name") {
				if(piece.nomBrique.contains(textTyped)) {
					this.maListAffiche.add(piece);
				}
			}
			if(elmtCompare == "id") {
				String strId = String.valueOf(piece.IdBrique);
				if(strId.contains(textTyped)) {
					this.maListAffiche.add(piece);
					System.out.println(piece.nomBrique);
				}
			}
			if(elmtCompare == "color") {
				String strCol = new String();
				ColorUtils colScript = new ColorUtils();
				strCol = colScript.getColorNameFromColor(piece.color).toLowerCase();
				if(strCol.contains(textTyped)) {
					this.maListAffiche.add(piece);
					System.out.println(piece.nomBrique);
				}
			}
		}
		System.out.println();
		this.setChanged();
		this.notifyObservers(maListAffiche);
	}

	public void AddAPiece(int mouseX, int mouseY) {
		int posX=0;
		int posY=0;
		if(angleVue<4) {
			posX = mouseX/30;
			posY = mouseY/40;
		}
		else if(angleVue<6) {
			posX = mouseX/30;
			posY = mouseY/30;
		}
		else {
			posX = mouseX/(int)((15 *Math.sqrt(3))*0.65);
			posY = mouseY/(int)((30)*0.65);
		}
		Position1 pos = new Position1(posX, posY);
		this.setChanged();
		this.notifyObservers(pos);
		
	}
}

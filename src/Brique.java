import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class Brique implements Serializable{

	private static final long serialVersionUID = 5128347975856112905L;
	
	String nomBrique;
	int IdBrique;
	Color color;
	int longueurBrique;
	int largeurBrique;
	int hauteurBrique;
	HashSet<String> tagsBrique;
	
	public Brique(String n, int id, int lon, int larg, int haut, Color c) {
		this.nomBrique=n;
		this.IdBrique=id;
		this.longueurBrique=lon;
		this.largeurBrique=larg;
		this.hauteurBrique=haut;
		this.color = c;
	}
//test eviter les accents svp ca bug sur ma version d'eclipse
}

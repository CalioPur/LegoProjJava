import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class Brique implements Serializable{

	private static final long serialVersionUID = 5128347975856112905L;
	
	String nomBrique;
	int IdBrique;
	HashMap<Integer,Color> couleurBrique;
	int longueurBrique;
	int largeurBrique;
	int hauteurBrique;
	String coordonneesBrique;
	HashSet<String> tagsBrique;
	
	public Brique(String n, int i, int lon, int larg, int haut, String coord) {
		this.nomBrique=n;
		this.IdBrique=i;
		this.longueurBrique=lon;
		this.largeurBrique=larg;
		this.hauteurBrique=haut;
		this.coordonneesBrique=coord;
	}
//test eviter les accents svp ca bug sur ma version d'eclipse
}

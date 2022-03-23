import java.awt.Color;
import java.util.HashSet;

public class Brique {
	String nomBrique;
	int IdBrique;
	Color couleurBrique;
	int longueurBrique;
	int largeurBrique;
	int hauteurBrique;
	String coordonnéesBrique;
	HashSet<String> tagsBrique;
	public Brique(String n, int i, Color c, int lon, int larg, int haut, String coord) {
		this.nomBrique=n;
		this.IdBrique=i;
		this.couleurBrique=c;
		this.longueurBrique=lon;
		this.largeurBrique=larg;
		this.hauteurBrique=haut;
		this.coordonnéesBrique=coord;
	}
}

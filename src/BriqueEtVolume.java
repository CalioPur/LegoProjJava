import java.awt.Color;
import java.util.Comparator;

public class BriqueEtVolume implements Comparable{
	public int x;
	public int y;
	public Brique brique;
	public BriqueEtVolume(int x, int y,Brique b) {
		this.x=x;
		this.y=y;
		this.brique=b;
	}
	
	public static void main(String[] args) {
		BriqueEtVolume b= new BriqueEtVolume(1,2,new Brique("2x2", 100, 2, 2, 1, Color.red));
		BriqueEtVolume b2= new BriqueEtVolume(1,1,new Brique("2x2", 100, 2, 2, 1, Color.red));
		System.out.println(b.compareTo(b2));
	}

	public int compareTo(BriqueEtVolume o) {
		return this.y-o.y;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

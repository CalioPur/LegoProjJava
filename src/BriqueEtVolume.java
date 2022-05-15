import java.awt.Color;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class BriqueEtVolume implements Comparable{
	public int x;
	public int y;
	public int z;
	public int o;
	public Brique brique;
	public BriqueEtVolume(int x, int y,int z,int o,Brique b) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.o=o;
		this.brique=b;
	}
	
	
	public static void main(String[] args) {
		BriqueEtVolume b= new BriqueEtVolume(1,3,0,0,new Brique("3x2", 100, 2, 2, 1, Color.red));
		BriqueEtVolume b4= new BriqueEtVolume(1,4,0,0,new Brique("4x2", 100, 2, 2, 1, Color.red));
		BriqueEtVolume b2= new BriqueEtVolume(1,1,0,1,new Brique("1x2", 100, 2, 2, 1, Color.red));
		BriqueEtVolume b3= new BriqueEtVolume(1,2,0,1,new Brique("2x2", 100, 2, 2, 1, Color.red));
		PriorityQueue<BriqueEtVolume> p= new PriorityQueue<BriqueEtVolume>();
		
		p.add(b2);
		p.add(b);
		p.add(b3);
		System.out.println(b.compareTo(b2));
		System.out.println(p.peek().brique.nomBrique);
		
		PriorityQueue<BriqueEtVolume> p2=new PriorityQueue<BriqueEtVolume>(p);
		System.out.println(p.size());
		while(!p.isEmpty()) {
			System.out.println(p.peek().brique.nomBrique);
			p.poll();
		}
		p=p2;
		System.out.println(p.size());
	}

	@Override
	public int compareTo(Object o) {
		BriqueEtVolume x=(BriqueEtVolume)o;
		return x.y-this.y;
	}
}

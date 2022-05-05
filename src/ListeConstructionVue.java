import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ListeConstructionVue{
	Queue<BriqueEtVolume> b;
	ListeConstructionVue(){
		this.b=new LinkedList<BriqueEtVolume>();
	}

	public static void main(String[] args) {
		ListeConstructionVue c = new ListeConstructionVue();
		c.b.add(new BriqueEtVolume(0,0,0,new Brique("2x2", 100, 2, 2, 1, Color.red)));
		System.out.println(c.b.isEmpty());
		System.out.println(c.b.element().brique.nomBrique);
	}


}

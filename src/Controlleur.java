import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controlleur implements ActionListener, ItemListener {

	Modele modl;
	Object prec;
	Object next;

	public Controlleur(Modele m, Object a, Object b) {
		this.modl = m;
		this.prec = a;
		this.next = b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			this.modl.prochainAngleVue();
		}
		if(e.getSource()==prec) {
			this.modl.precedentAngleVue();
		}
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		this.modl.nouvelleBriqueSelectionnee(e.getItem());
		
	}
	
}

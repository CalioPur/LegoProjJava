import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controlleur implements ActionListener, ItemListener {

	Modele modl;
	
	public Controlleur(Modele m) {
		this.modl = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.modl.doSomething();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());
		this.modl.nouvelleBriqueSelectionnee(e.getItem());
		
	}
	
}

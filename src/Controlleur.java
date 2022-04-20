import java.awt.Button;
import java.awt.Checkbox;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

public class Controlleur implements ActionListener, ItemListener, KeyListener, DocumentListener {

	Modele modl;
	

	public Controlleur(Modele m){
		this.modl = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnSource = (Button) e.getSource();
		String lbl = btnSource.getLabel();
		if(lbl == "vue de face") {
			this.modl.prochainAngleVue(0);
		}
		if(lbl == "vue de cote droit") {
			this.modl.prochainAngleVue(1);
		}
		if(lbl == "vue de derriere") {
			this.modl.prochainAngleVue(2);
		}
		if(lbl == "vue de cote gauche") {
			this.modl.prochainAngleVue(3);
		}
		if(lbl == "vue de dessus") {
			this.modl.prochainAngleVue(4);
		}
		if(lbl == "vue de dessous") {
			this.modl.prochainAngleVue(5);
		}
		if(lbl == "vue isometrique") {
			this.modl.prochainAngleVue(6);
		}
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		try {
			Checkbox cbs = (Checkbox) e.getSource();
			this.modl.chmtTag(cbs.getLabel());
		}
		catch(Exception ex) {
			this.modl.nouvelleBriqueSelectionnee(e.getItem());
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		TextField tf = (TextField)arg0.getSource();
		System.out.println(tf.getText());
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		try {
			this.modl.actuList(e.getDocument().getText(0, e.getDocument().getLength()));
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		try {
			this.modl.actuList(e.getDocument().getText(0, e.getDocument().getLength()));
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

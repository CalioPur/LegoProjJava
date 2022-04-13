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
		// TODO Auto-generated method stub
		this.modl.nouvelleBriqueSelectionnee(e.getItem());
		
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

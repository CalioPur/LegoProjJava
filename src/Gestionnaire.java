import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;

public class Gestionnaire extends Frame implements WindowListener{
	public Button prec=new Button("precedent view");
	public Button next=new Button("next view");
	
	public Gestionnaire() {
		
		Modele modl = new Modele();
		
		Controlleur ctrl = new Controlleur(modl, prec, next);
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		
		VueDesPieces pieces = new VueDesPieces(modl);
		pieces.setSize(500,500);
		this.add(pieces, BorderLayout.CENTER);
		
		Panel listAndSearchBar = new Panel(new BorderLayout());
		JTextField textField = new JTextField(10);
		ListBrique mesBriques = new ListBrique(modl);
		//textField.addKeyListener(ctrl);
		textField.getDocument().addDocumentListener(ctrl);
		mesBriques.maListe.addItemListener(ctrl);
		listAndSearchBar.add(textField, BorderLayout.NORTH);
		listAndSearchBar.add(mesBriques, BorderLayout.CENTER);
		this.add(listAndSearchBar, BorderLayout.WEST);
		
		Panel containerPanel = new Panel(new GridLayout(1, 2));
		prec.addActionListener(ctrl);
		next.addActionListener(ctrl);
		containerPanel.add(prec);
		containerPanel.add(next);
		this.add(containerPanel, BorderLayout.SOUTH);
		
		this.addWindowListener(this);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Gestionnaire();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

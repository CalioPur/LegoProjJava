import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextField;

public class Gestionnaire extends Frame implements WindowListener{
	
	public Gestionnaire() {
		
		Modele modl = new Modele();
		
		Controlleur ctrl = new Controlleur(modl);
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		
		VueDesPieces pieces = new VueDesPieces(modl);
		pieces.setSize(500,500);
		this.add(pieces, BorderLayout.CENTER);
		
		Panel listAndSearchBar = new Panel(new BorderLayout());
		JTextField textField = new JTextField(10);
		ListBrique mesBriques = new ListBrique(modl);
		textField.getDocument().addDocumentListener(ctrl);
		mesBriques.maListe.addItemListener(ctrl);
		listAndSearchBar.add(textField, BorderLayout.NORTH);
		listAndSearchBar.add(mesBriques, BorderLayout.CENTER);
		this.add(listAndSearchBar, BorderLayout.WEST);
		
		Panel containerPanel = new Panel(new GridLayout(2, 3));
		Button btn0 = new Button("vue de face");
		btn0.addActionListener(ctrl);
		Button btn1 = new Button("vue de derriere");
		btn1.addActionListener(ctrl);
		Button btn2 = new Button("vue de coté droit");
		btn2.addActionListener(ctrl);
		Button btn3 = new Button("vue de coté gauche");
		btn3.addActionListener(ctrl);
		Button btn4 = new Button("vue de dessus");
		btn4.addActionListener(ctrl);
		Button btn5 = new Button("vue de dessous");
		btn5.addActionListener(ctrl);
		Button btn6 = new Button("vue isometrique");
		btn6.addActionListener(ctrl);
		containerPanel.add(btn0);
		containerPanel.add(btn1);
		containerPanel.add(btn2);
		containerPanel.add(btn3);
		containerPanel.add(btn4);
		containerPanel.add(btn5);
		containerPanel.add(btn6);
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

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
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
		
		VueDesPieces2 pieces2 = new VueDesPieces2(modl);
		pieces2.setSize(600,400);
		this.add(pieces2, BorderLayout.EAST);
		
		Panel listAndSearchBar = new Panel(new BorderLayout());
		JTextField textField = new JTextField(10);
		ListBrique mesBriques = new ListBrique(modl);
		textField.getDocument().addDocumentListener(ctrl);
		mesBriques.maListe.addItemListener(ctrl);
		listAndSearchBar.add(textField, BorderLayout.NORTH);
		listAndSearchBar.add(mesBriques, BorderLayout.CENTER);
		
		Panel tag = new Panel(new GridLayout(1, 3));
		CheckboxGroup grp = new CheckboxGroup();
		Checkbox name = new Checkbox("name", true, grp);
		name.addItemListener(ctrl);
		Checkbox id = new Checkbox("id",false, grp);
		id.addItemListener(ctrl);
		Checkbox color = new Checkbox("color",false, grp);
		color.addItemListener(ctrl);
		tag.add(name);
		tag.add(color);
		tag.add(id);
		
		listAndSearchBar.add(tag, BorderLayout.SOUTH );
		
		this.add(listAndSearchBar, BorderLayout.WEST);
		
		Panel containerPanel = new Panel(new GridLayout(2, 3));
		Button btn0 = new Button("vue de face");
		btn0.addActionListener(ctrl);
		Button btn1 = new Button("vue de derriere");
		btn1.addActionListener(ctrl);
		Button btn2 = new Button("vue de cote droit");
		btn2.addActionListener(ctrl);
		Button btn3 = new Button("vue de cote gauche");
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

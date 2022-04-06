import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Gestionnaire extends Frame implements WindowListener{
	public Gestionnaire() {
		
		Modele modl = new Modele();
		
		Controlleur ctrl = new Controlleur(modl);
		
		this.setLayout(new BorderLayout());
		
		VueDesPieces pieces = new VueDesPieces(modl);
		pieces.setSize(500,500);
		this.add(pieces, BorderLayout.EAST);
		
		ListBrique mesBriques = new ListBrique(modl);
		mesBriques.maListe.addItemListener(ctrl);
		this.add(mesBriques, BorderLayout.WEST);

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

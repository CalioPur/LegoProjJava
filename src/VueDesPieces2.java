
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class VueDesPieces2 extends Canvas implements Observer {
	Brique brk = null;
	int angle = 0;

	public VueDesPieces2(Modele m) {
		super();
		Canvas cnv = new Canvas();
		cnv.setBackground(Color.blue);
		cnv.setSize(600, 400);

		cnv.setVisible(true);
		m.addObserver(this);
	}

	public void paint(Graphics g) {
		
	}

	@Override
	public void update(Observable o, Object arg0) {
		try {
			brk = (Brique) arg0;
			paint(getGraphics());
		} catch (Exception e) {
			try{
				angle = (int) arg0;
				repaint();
			}
			catch (Exception e2) {
				try {
					ArrayList<Integer> pos = (ArrayList<Integer>) arg0;
					int posX = (int) pos.get(0);
					int posY = (int) pos.get(1);
				}
				catch(Exception e3) {
					
				}
			}
		}
	}
}

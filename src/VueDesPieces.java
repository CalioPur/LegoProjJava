
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class VueDesPieces extends Canvas implements Observer{
	Brique brk = null;
	
	public VueDesPieces(Modele m) {
		super();
		Canvas cnv = new Canvas();
		cnv.setBackground(Color.blue);
		cnv.setSize(500, 500);
		cnv.setVisible(true);
		m.addObserver(this);
	}
	public void paint(Graphics g) {
		if (brk!=null) {
			int x1= 250-((brk.longueurBrique*30)/2);
			int y1= 250-((brk.hauteurBrique*40)/2);
			int x2= brk.longueurBrique*30;
			int y2= brk.hauteurBrique*40;
			g.drawRect(x1, y1, x2, y2);
		}
	}
	@Override
	public void update(Observable o, Object arg0) {
		System.out.println("coucou");
		brk = (Brique) arg0;
		repaint();
	}
}

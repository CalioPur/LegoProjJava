
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class VueDesPieces extends Canvas implements Observer{
	Brique brk = null;
	int angle = 0;
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
			if (angle==0) {
				int x1= 250-((brk.longueurBrique*30)/2);
				int y1= 250-((brk.hauteurBrique*40)/2);
				int x2= brk.longueurBrique*30;
				int y2= brk.hauteurBrique*40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for(int i=0; i<brk.longueurBrique; i++) {
					x1=250-((brk.longueurBrique*30)/2)+(i*30)+5;
					y1=250-((brk.hauteurBrique*40)/2)-5;
					x2=20;
					y2=5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle==1) {
				int x1= 250-((brk.largeurBrique*30)/2);
				int y1= 250-((brk.hauteurBrique*40)/2);
				int x2= brk.largeurBrique*30;
				int y2= brk.hauteurBrique*40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for(int i=0; i<brk.largeurBrique; i++) {
					x1=250-((brk.largeurBrique*30)/2)+(i*30)+5;
					y1=250-((brk.hauteurBrique*40)/2)-5;
					x2=20;
					y2=5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle==2) {
				int x1= 250-((brk.longueurBrique*30)/2);
				int y1= 250-((brk.hauteurBrique*40)/2);
				int x2= brk.longueurBrique*30;
				int y2= brk.hauteurBrique*40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for(int i=0; i<brk.longueurBrique; i++) {
					x1=250-((brk.longueurBrique*30)/2)+(i*30)+5;
					y1=250-((brk.hauteurBrique*40)/2)-5;
					x2=20;
					y2=5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle==3) {
				int x1= 250-((brk.largeurBrique*30)/2);
				int y1= 250-((brk.hauteurBrique*40)/2);
				int x2= brk.largeurBrique*30;
				int y2= brk.hauteurBrique*40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for(int i=0; i<brk.largeurBrique; i++) {
					x1=250-((brk.largeurBrique*30)/2)+(i*30)+5;
					y1=250-((brk.hauteurBrique*40)/2)-5;
					x2=20;
					y2=5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle==4) {
				int x1= 250-((brk.largeurBrique*30)/2);
				int y1= 250-((brk.longueurBrique*30)/2);
				int x2= brk.largeurBrique*30;
				int y2= brk.longueurBrique*30;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for(int i=0; i<brk.largeurBrique; i++) {
					for(int j=0; j<brk.longueurBrique;j++) {
						x1=250-((brk.largeurBrique*30)/2)+(i*30)+5;
						y1=250-((brk.longueurBrique*30)/2)+(j*30)+5;
						g.setColor(Color.black);
						g.drawArc(x1, y1, 20, 20, 0, 360);
					}
				}
			}
			if (angle==5) {
				int x1= 250-((brk.largeurBrique*30)/2);
				int y1= 250-((brk.longueurBrique*30)/2);
				int x2= brk.largeurBrique*30;
				int y2= brk.longueurBrique*30;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
			}
		}
	}
	@Override
	public void update(Observable o, Object arg0) {
		try {
			brk = (Brique) arg0;
		}
		catch(Exception e) {
			angle = (int) arg0;
		}
		repaint();
	}
}

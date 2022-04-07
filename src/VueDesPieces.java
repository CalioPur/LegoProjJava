
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Observable;
import java.util.Observer;

public class VueDesPieces extends Canvas implements Observer {
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
		if (brk != null) {
			if (angle == 0) {
				int x1 = 250 - ((brk.longueurBrique * 30) / 2);
				int y1 = 250 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					x1 = 250 - ((brk.longueurBrique * 30) / 2) + (i * 30) + 5;
					y1 = 250 - ((brk.hauteurBrique * 40) / 2) - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle == 1) {
				int x1 = 250 - ((brk.largeurBrique * 30) / 2);
				int y1 = 250 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					x1 = 250 - ((brk.largeurBrique * 30) / 2) + (i * 30) + 5;
					y1 = 250 - ((brk.hauteurBrique * 40) / 2) - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle == 2) {
				int x1 = 250 - ((brk.longueurBrique * 30) / 2);
				int y1 = 250 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					x1 = 250 - ((brk.longueurBrique * 30) / 2) + (i * 30) + 5;
					y1 = 250 - ((brk.hauteurBrique * 40) / 2) - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle == 3) {
				int x1 = 250 - ((brk.largeurBrique * 30) / 2);
				int y1 = 250 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					x1 = 250 - ((brk.largeurBrique * 30) / 2) + (i * 30) + 5;
					y1 = 250 - ((brk.hauteurBrique * 40) / 2) - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x1, y1, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x1, y1, x2, y2);
				}
			}
			if (angle == 4) {
				int x1 = 250 - ((brk.largeurBrique * 30) / 2);
				int y1 = 250 - ((brk.longueurBrique * 30) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.longueurBrique * 30;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {
						x1 = 250 - ((brk.largeurBrique * 30) / 2) + (i * 30) + 5;
						y1 = 250 - ((brk.longueurBrique * 30) / 2) + (j * 30) + 5;
						g.setColor(Color.black);
						g.drawArc(x1, y1, 20, 20, 0, 360);
						
					}
				}
			}
			if (angle == 5) {
				int x1 = 250 - ((brk.largeurBrique * 30) / 2);
				int y1 = 250 - ((brk.longueurBrique * 30) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.longueurBrique * 30;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {
						x1 = 250 - ((brk.largeurBrique * 30) / 2) + (i * 30) + 5;
						y1 = 250 - ((brk.longueurBrique * 30) / 2) + (j * 30) + 5;
						g.setColor(brk.color.darker());
						g.fillArc(x1, y1, 20, 20, 0, 360);
						g.setColor(Color.black);
						g.drawArc(x1, y1, 20, 20, 0, 360);
						g.drawArc(x1+2, y1+2, 18, 18, 0, 360);
					}
				}
			}
			if (angle == 6) {
				//face du dessus
				int x1 = (int) (250 - ((brk.largeurBrique * 30 *Math.sqrt(3)) / 2));
				int y1 = 250 - ((brk.largeurBrique * 30) / 2);
				int x2 = (int) (brk.longueurBrique * 30 *Math.sqrt(3));
				int y2 = brk.longueurBrique * 30;
				int x3 = (int) (brk.largeurBrique * 30 *Math.sqrt(3));
				int y3 = brk.largeurBrique * 30;
				Polygon poly1 = new Polygon();
				poly1.addPoint(x1, y1);
				poly1.addPoint(x1+x2/2, y1-y2/2);
				poly1.addPoint(x1+x2/2+x3/2, y1-y2/2+y3/2);
				poly1.addPoint(x1+x3/2, y1+y3/2);
				g.setColor(brk.color);
				g.fillPolygon(poly1);
				g.setColor(Color.black);
				g.drawPolygon(poly1);
				//les putins de connecteurs briques
				for (int i = 0; i < brk.longueurBrique; i++) {
					for (int j = 0; j < brk.largeurBrique; j++) {
						int x4 = x1 + (int)(i * 15*Math.sqrt(3)+10*Math.sqrt(3)+j * 15*Math.sqrt(3))-2;
						int y4 = y1 + (j * 30/2) - 10-(i*30/2);
						g.setColor(Color.black);
						g.drawArc(x4, y4, 20,(int) (20-20/Math.sqrt(3)), 0, 360);
						g.drawLine(x4, y4+(int) (20-20/Math.sqrt(3))/2, x4, y4+5+(int) (20-20/Math.sqrt(3))/2);
						g.drawLine(x4+20, y4+(int) (20-20/Math.sqrt(3))/2, x4+20, y4+5+(int) (20-20/Math.sqrt(3))/2);
						g.drawArc(x4, y4+5+(int) (20-20/Math.sqrt(3))/4, 20,(int) (20-20/Math.sqrt(3)), 0, -180);
					}
				}
				
				//face gauche
				int z1=brk.hauteurBrique * 40;
				Polygon poly2 = new Polygon();
				poly2.addPoint(x1, y1);
				poly2.addPoint(x1, y1+z1);
				poly2.addPoint(x1+x3/2, y1+y3/2+z1);
				poly2.addPoint(x1+x3/2, y1+y3/2);
				g.setColor(brk.color);
				g.fillPolygon(poly2);
				g.setColor(Color.black);
				g.drawPolygon(poly2);
				//face droite
				Polygon poly3 = new Polygon();
				poly3.addPoint(x1+x3/2, y1+y3/2);
				poly3.addPoint(x1+x3/2, y1+y3/2+z1);
				poly3.addPoint(x1+x2/2+x3/2, y1-y2/2+y3/2+z1);
				poly3.addPoint(x1+x2/2+x3/2, y1-y2/2+y3/2);
				g.setColor(brk.color);
				g.fillPolygon(poly3);
				g.setColor(Color.black);
				g.drawPolygon(poly3);
			}
		}
	}

	@Override
	public void update(Observable o, Object arg0) {
		try {
			brk = (Brique) arg0;
		} catch (Exception e) {
			angle = (int) arg0;
		}
		repaint();
	}
}

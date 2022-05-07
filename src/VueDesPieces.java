
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
	int sizeX=240;int sizeY=500;
	int etat=0;
	public VueDesPieces(Modele m) {
		super();
		Canvas cnv = new Canvas();
		cnv.setBackground(Color.blue);
		cnv.setSize(sizeX, sizeY);

		cnv.setVisible(true);
		m.addObserver(this);
	}
	
	
	public void paint(Graphics g) {
		if(etat==0) {		
			g.setColor(new Color(51,204,255,100));
			g.fillRect(0, 0, sizeX, sizeY);			
		}
		if (brk != null) {
			if (angle == 0) {
				int x1 = (int)sizeX/2 - ((brk.longueurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.hauteurBrique * 40) / 2);
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*40+2;
				}
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					int x3 = x1 + (i * 30) + 5;
					int y3 = y1 - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x3, y3, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x3, y3, x2, y2);
				}
			}
			if (angle == 1) {
				int x1 = (int)sizeX/2 - ((brk.largeurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*40+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					int x3 = x1 + (i * 30) + 5;
					int y3 = y1 - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x3, y3, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x3, y3, x2, y2);
				}
			}
			if (angle == 2) {
				int x1 = (int)sizeX/2 - ((brk.longueurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*40+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					int x3 = x1 + (i * 30) + 5;
					int y3 = y1 - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x3, y3, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x3, y3, x2, y2);
				}
			}
			if (angle == 3) {
				int x1 = (int)sizeX/2 - ((brk.largeurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.hauteurBrique * 40) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.hauteurBrique * 40;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*40+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					int x3 = x1 + (i * 30) + 5;
					int y3 = y1 - 5;
					x2 = 20;
					y2 = 5;
					g.setColor(brk.color);
					g.fillRect(x3, y3, x2, y2);
					g.setColor(Color.black);
					g.drawRect(x3, y3, x2, y2);
				}
			}
			if (angle == 4) {
				int x1 = (int)sizeX/2 - ((brk.largeurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.longueurBrique * 30) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.longueurBrique * 30;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*30+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {
						int x3 = x1 + (i * 30) + 5;
						int y3 = y1 + (j * 30) + 5;
						g.setColor(Color.black);
						g.drawArc(x3, y3, 20, 20, 0, 360);
						
					}
				}
			}
			if (angle == 5) {
				int x1 = (int)sizeX/2 - ((brk.longueurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.largeurBrique * 30) / 2);
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.largeurBrique * 30;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*30+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					for (int j = 0; j < brk.largeurBrique; j++) {
						int x3 = x1 + (i * 30) + 5;
						int y3 = y1 + (j * 30) + 5;
						g.setColor(Color.black);
						g.drawArc(x3, y3, 20, 20, 0, 360);
						
					}
				}
			}
			if (angle == 6) {
				int x1 = (int)sizeX/2 - ((brk.largeurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.longueurBrique * 30) / 2);
				int x2 = brk.largeurBrique * 30;
				int y2 = brk.longueurBrique * 30;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*30+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.largeurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {
						int x3 = x1 + (i * 30) + 5;
						int y3 = y1 + (j * 30) + 5;
						g.setColor(brk.color.darker());
						g.fillArc(x3, y3, 20, 20, 0, 360);
						g.setColor(Color.black);
						g.drawArc(x3, y3, 20, 20, 0, 360);
						g.drawArc(x3+2, y3+2, 18, 18, 0, 360);
					}
				}
			}
			if (angle == 7) {
				int x1 = (int)sizeX/2 - ((brk.longueurBrique * 30) / 2);
				int y1 = (int)sizeY/2 - ((brk.largeurBrique * 30) / 2);
				int x2 = brk.longueurBrique * 30;
				int y2 = brk.largeurBrique * 30;
				if(etat!=0) {
					x1=sizeX*30+2;
					y1=sizeY*30+2;
				}
				g.setColor(brk.color);
				g.fillRect(x1, y1, x2, y2);
				g.setColor(Color.black);
				g.drawRect(x1, y1, x2, y2);
				for (int i = 0; i < brk.longueurBrique; i++) {
					for (int j = 0; j < brk.largeurBrique; j++) {
						int x3 = x1 + (i * 30) + 5;
						int y3 = y1 + (j * 30) + 5;
						g.setColor(brk.color.darker());
						g.fillArc(x3, y3, 20, 20, 0, 360);
						g.setColor(Color.black);
						g.drawArc(x3, y3, 20, 20, 0, 360);
						g.drawArc(x3+2, y3+2, 18, 18, 0, 360);
					}
				}
			}
			if (angle == 8) {
				//face du dessus
				int x1 = (int) ((int)sizeX/2 - (((brk.largeurBrique+brk.longueurBrique)/2 * 30 *Math.sqrt(3)) / 2));
				int y1 = (int)sizeY/2 - ((brk.largeurBrique * 30) / 2)-50;
				int x2 = (int) (brk.longueurBrique * 30 *Math.sqrt(3));
				int y2 = brk.longueurBrique * 30;
				int x3 = (int) (brk.largeurBrique * 30 *Math.sqrt(3));
				int y3 = brk.largeurBrique * 30;
				int z1=brk.hauteurBrique * 30;
				if (etat!=0) {
					x1=(int)(sizeX*15 *Math.sqrt(3)*0.65);
					x2=(int)(x2*0.65);
					x3=(int)(x3*0.65);
					y1=(int)(sizeY*30*0.65);
					y2=(int)(y2*0.65);
					y3=(int)(y3*0.65);
					z1=(int)(z1*0.65);
				}
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
						g.setColor(Color.black);
						if (etat!=0) {
							int x4 = (int)(x1/0.65) + (int)(i * 15*Math.sqrt(3)+10*Math.sqrt(3)+j * 15*Math.sqrt(3))-2;
							int y4 = (int)(y1/0.65) + (j * 30/2) - 10-(i*30/2);
						    g.drawArc((int)(x4*0.65), (int)(y4*0.65), (int)(20*0.65),(int) ((20-20/Math.sqrt(3))*0.65), 0, 360);
							g.drawLine((int)(x4*0.65), (int)((y4+(20-20/Math.sqrt(3))/2)*0.65), (int)(x4*0.65), (int)((y4+5+(20-20/Math.sqrt(3))/2)*0.65));
							g.drawLine((int)((x4+20)*0.65), (int)((y4+(20-20/Math.sqrt(3))/2)*0.65), (int)((x4+20)*0.65), (int)((y4+5+(20-20/Math.sqrt(3))/2)*0.65));
							g.drawArc((int)(x4*0.65), (int)((y4+5+(20-20/Math.sqrt(3))/4)*0.65), (int)(20*0.65),(int) ((20-20/Math.sqrt(3))*0.65), 0, -180);
						}
						else {
							int x4 = x1 + (int)(i * 15*Math.sqrt(3)+10*Math.sqrt(3)+j * 15*Math.sqrt(3))-2;
							int y4 = y1 + (j * 30/2) - 10-(i*30/2);
							g.drawArc(x4, y4, 20,(int) (20-20/Math.sqrt(3)), 0, 360);
							g.drawLine(x4, y4+(int) (20-20/Math.sqrt(3))/2, x4, y4+5+(int) (20-20/Math.sqrt(3))/2);
							g.drawLine(x4+20, y4+(int) (20-20/Math.sqrt(3))/2, x4+20, y4+5+(int) (20-20/Math.sqrt(3))/2);
							g.drawArc(x4, y4+5+(int) (20-20/Math.sqrt(3))/4, 20,(int) (20-20/Math.sqrt(3)), 0, -180);
						}
						
					}
				}
				//face gauche
				Polygon poly2 = new Polygon();
				poly2.addPoint(x1, y1);
				poly2.addPoint(x1, y1+z1);
				poly2.addPoint(x1+x3/2, y1+y3/2+z1);
				poly2.addPoint(x1+x3/2, y1+y3/2);
				g.setColor(brk.color.brighter());
				g.fillPolygon(poly2);
				g.setColor(Color.black);
				g.drawPolygon(poly2);
				//face droite
				Polygon poly3 = new Polygon();
				poly3.addPoint(x1+x3/2, y1+y3/2);
				poly3.addPoint(x1+x3/2, y1+y3/2+z1);
				poly3.addPoint(x1+x2/2+x3/2, y1-y2/2+y3/2+z1);
				poly3.addPoint(x1+x2/2+x3/2, y1-y2/2+y3/2);
				g.setColor(brk.color.darker());
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
			try{
				angle = (int) arg0;
			}
			catch (Exception e2) {
				
			}
		}
		repaint();
	}
}


import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.text.Position;

public class construction extends Canvas implements Observer {
	Brique brk = null;
	int angle = 0;
	double rota = 0;
	VueDesPieces vue;
	int dimx=25;
	int dimy=15;
	PriorityQueue<BriqueEtVolume> face;
	PriorityQueue<BriqueEtVolume> droit;
	PriorityQueue<BriqueEtVolume> derriere;
	PriorityQueue<BriqueEtVolume> gauche;
	PriorityQueue<BriqueEtVolume> dessus;
	PriorityQueue<BriqueEtVolume> dessous;
	PriorityQueue<BriqueEtVolume> iso;
	public construction(Modele m,VueDesPieces v) {
		super();
		Canvas cnv = new Canvas();
		cnv.setBackground(Color.blue);
		cnv.setSize(1000, 600);
		cnv.setVisible(true);
		this.face=new PriorityQueue<BriqueEtVolume>();
		this.droit=new PriorityQueue<BriqueEtVolume>();
		this.derriere=new PriorityQueue<BriqueEtVolume>();
		this.gauche=new PriorityQueue<BriqueEtVolume>();
		this.dessus=new PriorityQueue<BriqueEtVolume>();
		this.dessous=new PriorityQueue<BriqueEtVolume>();
		this.iso=new PriorityQueue<BriqueEtVolume>();
		this.vue=v;
		m.addObserver(this);	
	}
	
	public void uneConstruction(Graphics g, Queue<BriqueEtVolume> l) {
		if (angle==0) {
			
		}
		if (angle==1) {
			
		}
		if (angle==2) {
			
		}
		if (angle==3) {
			
		}
		if (angle==4) {
			
		}
		if (angle==6) {
			
		}
		if (angle==8) {
			
		}
		
	}
	
	public void paint(Graphics g){
		
				if (angle == 0) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimy;j++) {				
							g.fillArc(i*30,j*40,4,4,0,360);
						}
					}
				}
				if (angle == 1) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimy;j++) {				
							g.fillArc(i*30,j*40,4,4,0,360);
						}
					}
				}
				if (angle == 2) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimy;j++) {				
							g.fillArc(i*30,j*40,4,4,0,360);
						}
					}
				}
				if (angle == 3) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimy;j++) {				
							g.fillArc(i*30,j*40,4,4,0,360);
						}
					}
				}
				if (angle == 4) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimx;j++) {				
							g.fillArc(i*30,j*30,4,4,0,360);
						}
					}
				}
				if (angle == 6) {
					g.setColor(Color.LIGHT_GRAY);
					for (int i=0;i<dimx;i++) {
						for (int j=0;j<dimx;j++) {				
							g.fillArc(i*30,j*30,4,4,0,360);
						}
					}
				}
				if (angle == 8) {
					//face du dessus
					g.setColor(Color.LIGHT_GRAY);
					for (int z=0;z<dimy;z++) {
						for (int i=0;i<dimx;i++) {
							for (int j=0;j<dimx;j++) {			
								int coordx = (int)(i * 15*Math.sqrt(3)+10*Math.sqrt(3)+j * 15*Math.sqrt(3))-2;
								int coordy = (j * 30/2) - 10-(i*30/2)+dimx*dimy+z*30;
								g.fillArc((int)(coordx*0.65),(int)(coordy*0.65),4,4,0,360);
							}
					}}
		}		
	}

	@Override
	public void update(Observable o, Object arg0) {
		try {
			brk = (Brique) arg0;
		} catch (Exception e) {
			try{
				angle = (int) arg0;
				repaint();
			}
			catch (Exception e2) {
				try {
					Position1 pos = (Position1) arg0;
					System.out.println(pos);
					
					if (angle<4 && pos.x<dimx-1 && pos.y<dimy-1) {
						this.vue.etat=1;
						this.vue.sizeX=pos.x;
						this.vue.sizeY=pos.y;
						this.vue.paint(getGraphics());
						this.vue.sizeX=240;
						this.vue.sizeY=500;
						this.vue.etat=0;
					}
					if (angle>3 && angle<=6 && pos.x<dimx-1 && pos.y<dimx-1) {
						this.vue.etat=1;
						this.vue.sizeX=pos.x;
						this.vue.sizeY=pos.y;
						this.vue.paint(getGraphics());
						this.vue.sizeX=240;
						this.vue.sizeY=500;
						this.vue.etat=0;
					}
					
				}
				catch(Exception e3){
					try {
						rota=(double)arg0;
						this.vue.angle=(int)rota;
						System.out.println(rota);
					} 
					
					catch (Exception e4) {
						
					}
				}
				
			}
		}
	
	}
}

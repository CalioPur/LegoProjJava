
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
	Position1 pos=null;
	VueDesPieces vue;
	int dimx=25;
	int dimy=15;
	PriorityQueue<BriqueEtVolume> face;
	PriorityQueue<BriqueEtVolume> droit;
	PriorityQueue<BriqueEtVolume> derriere;
	PriorityQueue<BriqueEtVolume> gauche;
	Queue<BriqueEtVolume> dessus;
	Queue<BriqueEtVolume> dessous;
	Queue<BriqueEtVolume> iso;
	public construction(Modele m,VueDesPieces v) {
		super();
		Canvas cnv = new Canvas();
		cnv.setBackground(Color.blue);
		cnv.setSize(1000, 600);
		cnv.setVisible(true);
		this.face=new PriorityQueue<BriqueEtVolume>(375);
		this.droit=new PriorityQueue<BriqueEtVolume>(375);
		this.derriere=new PriorityQueue<BriqueEtVolume>(375);
		this.gauche=new PriorityQueue<BriqueEtVolume>(375);
		this.dessus=new LinkedList<BriqueEtVolume>();
		this.dessous=new LinkedList<BriqueEtVolume>();
		this.iso=new LinkedList<BriqueEtVolume>();
		this.vue=v;
		m.addObserver(this);	
	}
	
	public void uneConstruction(Graphics g) {
		
		if (angle==0) {
			this.vue.etat=1;
			PriorityQueue<BriqueEtVolume> temp = new PriorityQueue<BriqueEtVolume>(this.face);
			while(!this.face.isEmpty()) {
				this.vue.sizeX=this.face.peek().x;
				this.vue.sizeY=this.face.peek().y;
				this.vue.angle=this.face.peek().o;
				this.vue.brk=this.face.peek().brique;
				this.vue.paint(getGraphics());
				this.face.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.face=temp;
			this.vue.etat=0;
		}
		if (angle==1) {
			this.vue.etat=1;
			PriorityQueue<BriqueEtVolume> temp = new PriorityQueue<BriqueEtVolume>(this.droit);
			while(!this.droit.isEmpty()) {
				this.vue.sizeX=this.droit.peek().x;
				this.vue.sizeY=this.droit.peek().y;
				this.vue.angle=this.droit.peek().o;
				this.vue.brk=this.droit.peek().brique;
				this.vue.paint(getGraphics());
				this.droit.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.droit=temp;
			this.vue.etat=0;
		}
		if (angle==2) {
			this.vue.etat=1;
			PriorityQueue<BriqueEtVolume> temp = new PriorityQueue<BriqueEtVolume>(this.derriere);
			while(!this.derriere.isEmpty()) {
				this.vue.sizeX=this.derriere.peek().x;
				this.vue.sizeY=this.derriere.peek().y;
				this.vue.angle=this.derriere.peek().o;
				this.vue.brk=this.derriere.peek().brique;
				this.vue.paint(getGraphics());
				this.derriere.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.derriere=temp;
			this.vue.etat=0;
		}
		if (angle==3) {
			this.vue.etat=1;
			PriorityQueue<BriqueEtVolume> temp = new PriorityQueue<BriqueEtVolume>(this.gauche);
			while(!this.gauche.isEmpty()) {
				this.vue.sizeX=this.gauche.peek().x;
				this.vue.sizeY=this.gauche.peek().y;
				this.vue.angle=this.gauche.peek().o;
				this.vue.brk=this.gauche.peek().brique;
				this.vue.paint(getGraphics());
				this.gauche.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.gauche=temp;
			this.vue.etat=0;
		}
		if (angle==4) {
			this.vue.etat=1;
			Queue<BriqueEtVolume> temp = new LinkedList<BriqueEtVolume>(this.dessus);
			while(!this.dessus.isEmpty()) {
				this.vue.sizeX=this.dessus.peek().x;
				this.vue.sizeY=this.dessus.peek().y;
				this.vue.angle=this.dessus.peek().o;
				this.vue.brk=this.dessus.peek().brique;
				this.vue.paint(getGraphics());
				this.dessus.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.dessus=temp;
			this.vue.etat=0;
		}
		if (angle==6) {
			this.vue.etat=1;
			Queue<BriqueEtVolume> temp = new LinkedList<BriqueEtVolume>(this.dessous);
			while(!this.dessous.isEmpty()) {
				this.vue.sizeX=this.dessous.peek().x;
				this.vue.sizeY=this.dessous.peek().y;
				this.vue.angle=this.dessous.peek().o;
				this.vue.brk=this.dessous.peek().brique;
				this.vue.paint(getGraphics());
				this.dessous.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.dessous=temp;
			this.vue.etat=0;
		}
		if (angle==8) {
			this.vue.etat=1;
			Queue<BriqueEtVolume> temp = new LinkedList<BriqueEtVolume>(this.iso);
			while(!this.iso.isEmpty()) {
				this.vue.sizeX=this.iso.peek().x;
				this.vue.sizeY=this.iso.peek().y;
				this.vue.angle=this.iso.peek().o;
				this.vue.brk=this.iso.peek().brique;
				this.vue.paint(getGraphics());
				this.iso.poll();
			}
			this.vue.angle=angle;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.iso=temp;
			this.vue.etat=0;
		}
		
	}
	
	public void Sauvegarde() {
		if (angle==0) {
			this.face.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
		}
		if (angle==1) {
			this.droit.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
		}
		if (angle==2) {
			this.derriere.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
		}
		if (angle==3) {
			this.gauche.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
		}
		if (angle==4) {
			this.dessus.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
		}
		System.out.println("face"+this.face.peek().brique.nomBrique);
		System.out.println("droit"+this.droit.peek().brique.nomBrique);
		System.out.println("derriere"+this.derriere.peek().brique.nomBrique);
		System.out.println("gauche"+this.gauche.peek().brique.nomBrique);
		System.out.println("dessus"+this.dessus.peek().brique.nomBrique);
	}
	
	public boolean pasDeBrique() {
		boolean peuxplacer=true;
		if (angle==0) {
			for (BriqueEtVolume briqueEtVolume : face) {
				if(briqueEtVolume.x<=pos.x && briqueEtVolume.y<=pos.y && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>=pos.x && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>=pos.y) {
					peuxplacer=false;
				}
			}
		}
		if (angle==1) {
			for (BriqueEtVolume briqueEtVolume : droit) {
				
			}
		}
		if (angle==2) {
			for (BriqueEtVolume briqueEtVolume : derriere) {
				
			}
		}
		if (angle==3) {
			for (BriqueEtVolume briqueEtVolume : gauche) {
				
			}
		}
		if (angle==4) {
			
		}
		System.out.println(peuxplacer);
		return peuxplacer;
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
				uneConstruction(getGraphics());
	}

	@Override
	public void update(Observable o, Object arg0) {
		try {
			brk = (Brique) arg0;
		} catch (Exception e) {
			try{
				angle = (int) arg0;
				rota= (int) arg0;
				repaint();
			}
			catch (Exception e2) {
				try {
					pos = (Position1) arg0;
					System.out.println(pos);
					
					if (pasDeBrique() && angle<4 && pos.y+brk.hauteurBrique<dimy && ((pos.x+brk.largeurBrique<dimx && rota%2==1) || (pos.x+brk.longueurBrique<dimx && rota%2==0))) {
						this.vue.etat=1;
						this.vue.sizeX=pos.x;
						this.vue.sizeY=pos.y;
						this.vue.paint(getGraphics());
						this.vue.sizeX=240;
						this.vue.sizeY=500;
						this.vue.etat=0;
						Sauvegarde();
					}
					if (pasDeBrique() && angle>3 && angle<6 && (pos.x+brk.largeurBrique<dimx && pos.y+brk.longueurBrique<dimx && rota%2==0 ||pos.x+brk.longueurBrique<dimx && pos.y+brk.largeurBrique<dimx && rota%2==1 )) {
						this.vue.etat=1;
						this.vue.sizeX=pos.x;
						this.vue.sizeY=pos.y;
						this.vue.paint(getGraphics());
						this.vue.sizeX=240;
						this.vue.sizeY=500;
						this.vue.etat=0;
						Sauvegarde();
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


import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Comparator;
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
			this.vue.angle=(int)rota;
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
			this.vue.angle=(int)rota;
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
			this.vue.angle=(int)rota;
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
			this.vue.angle=(int)rota;
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
			this.vue.angle=(int)rota;
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
			this.vue.angle=(int)rota;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			this.dessous=temp;
			this.vue.etat=0;
		}
		if (angle==8) {
			/*for (int z=0;z<dimy;z++) {
				for (int i=0;i<dimx;i++) {
					for (int j=0;j<dimx;j++) {			
						int coordx = (int)(i * 15*Math.sqrt(3)+10*Math.sqrt(3)+j * 15*Math.sqrt(3))-2;
						int coordy = (j * 30/2) - 10-(i*30/2)+dimx*dimy+z*30;
						g.fillArc((int)(coordx*0.65),(int)(coordy*0.65),4,4,0,360);
					}
			}}**/
			
			
			this.vue.etat=1;
			Queue<BriqueEtVolume> temp = new LinkedList<BriqueEtVolume>(this.dessus);
			PriorityQueue<BriqueEtVolume> b3 = new PriorityQueue<BriqueEtVolume>(10000, new BriqueComparator3());
			while(!this.dessus.isEmpty()) {
				b3.add(this.dessus.peek());
				this.dessus.poll();
			}
			this.dessus=temp;
			
			PriorityQueue<BriqueEtVolume> temp4 = new PriorityQueue<BriqueEtVolume>(b3);
			while(!b3.isEmpty()) {
				if(b3.peek().o%2==0) {
					this.vue.sizeX=(int)(((10*Math.sqrt(3)+(b3.peek().x+24-b3.peek().brique.longueurBrique-b3.peek().y)*15*Math.sqrt(3))-2)*0.65)+2;
					this.vue.sizeY=(int)((((b3.peek().x)*30/2)+dimx*dimy-10+((b3.peek().y+4)*30/2)-b3.peek().z*30+(b3.peek().brique.longueurBrique-2)*30/2)*0.65)+2;
				}
				else {
					this.vue.sizeX=(int)(((10*Math.sqrt(3)+(b3.peek().x+24-b3.peek().brique.largeurBrique-b3.peek().y)*15*Math.sqrt(3))-2)*0.65)+2;
					this.vue.sizeY=(int)((((b3.peek().x)*30/2)+dimx*dimy-10+((b3.peek().y+4)*30/2)-b3.peek().z*30+(b3.peek().brique.largeurBrique-2)*30/2)*0.65)+2;
				}
				this.vue.angle=b3.peek().o+4;
				this.vue.brk=b3.peek().brique;
				this.vue.paint(getGraphics());
				b3.poll();
			}
			this.vue.angle=(int)rota;
			this.vue.sizeX=240;
			this.vue.sizeY=500;
			this.vue.brk=brk;
			b3=temp4;
			this.vue.etat=0;
			
			
			
			
		}
	}
	class BriqueComparator3 implements Comparator<BriqueEtVolume>{
        public int compare(BriqueEtVolume s1, BriqueEtVolume s2) {
        		if(s1.z-s2.z==0) {
        			if(s1.y-s2.y==0) {
        				return s1.x-s2.x;
        			}
        			return s1.y-s2.y;
        		}
            	return s1.z-s2.z;
            	
            }
    }
	public void Sauvegarde() {
		if (angle==0) {
			this.face.add(new BriqueEtVolume(pos.x,pos.y,dimy-pos.y-1,(int)rota,brk));
			if(pos.x==0 && rota==0) {
				this.gauche.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x==0 && rota==1) {
				this.gauche.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.x+brk.longueurBrique==dimx-1 && rota==0) {
				this.droit.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x+brk.largeurBrique==dimx-1 && rota==1) {
				this.droit.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1) {
				this.dessous.add(new BriqueEtVolume(pos.x,0,0,7-(int)rota,brk));
			}	
			if(rota==0) {
				this.dessus.add(new BriqueEtVolume(pos.x,dimx-1-brk.largeurBrique,dimy-(pos.y)-1-brk.hauteurBrique,5-(int)rota,brk));				
			}
			if(rota==1) {
				this.dessus.add(new BriqueEtVolume(pos.x,dimx-1-brk.longueurBrique,dimy-(pos.y)-1-brk.hauteurBrique,5-(int)rota,brk));
			}
		}
		if (angle==1) {
			this.droit.add(new BriqueEtVolume(pos.x,pos.y,dimy-pos.y-1,(int)rota,brk));
			if(pos.x==0 && rota==0) {
				this.face.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x==0 && rota==1) {
				this.face.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.x+brk.longueurBrique==dimx-1 && rota==0) {
				this.derriere.add(new BriqueEtVolume(0,pos.y,0,(int)rota+1,brk));
			}
			if(pos.x+brk.largeurBrique==dimx-1 && rota==1) {
				this.derriere.add(new BriqueEtVolume(0,pos.y,0,(int)rota-1,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==1) {
				this.dessous.add(new BriqueEtVolume(dimx-1-brk.longueurBrique,pos.x,0,(int)rota+6,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==0) {
				this.dessous.add(new BriqueEtVolume(dimx-1-brk.largeurBrique,pos.x,0,(int)rota+6,brk));
			}
			if(rota==0) {
				this.dessus.add(new BriqueEtVolume(dimx-1-brk.largeurBrique,dimx-brk.longueurBrique-pos.x-1,dimy-(pos.y)-1-brk.hauteurBrique,(int)rota+4,brk));				
			}
			if(rota==1) {
				this.dessus.add(new BriqueEtVolume(dimx-1-brk.longueurBrique,dimx-brk.largeurBrique-pos.x-1,dimy-(pos.y)-1-brk.hauteurBrique,(int)rota+4,brk));
			}
		}
		if (angle==2) {
			this.derriere.add(new BriqueEtVolume(pos.x,pos.y,dimy-pos.y-1,(int)rota,brk));
			if(pos.x==0 && rota==2) {
				this.droit.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x==0 && rota==3) {
				this.droit.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.x+brk.longueurBrique==dimx-1 && rota==2) {
				this.gauche.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x+brk.largeurBrique==dimx-1 && rota==3) {
				this.gauche.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==2) {
				this.dessous.add(new BriqueEtVolume(dimx-1-pos.x-brk.longueurBrique,dimx-1-brk.largeurBrique,0,9-(int)rota,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==3) {
				this.dessous.add(new BriqueEtVolume(dimx-1-pos.x-brk.largeurBrique,dimx-1-brk.longueurBrique,0,9-(int)rota,brk));
			}	
			if(rota==2) {
				this.dessus.add(new BriqueEtVolume(dimx-1-pos.x-brk.longueurBrique,0,dimy-(pos.y)-1-brk.hauteurBrique,7-(int)rota,brk));				
			}
			if(rota==3) {
				this.dessus.add(new BriqueEtVolume(dimx-1-pos.x-brk.largeurBrique,0,dimy-(pos.y)-1-brk.hauteurBrique,7-(int)rota,brk));
			}
		}
		if (angle==3) {
			this.gauche.add(new BriqueEtVolume(pos.x,pos.y,dimy-pos.y-1,(int)rota,brk));
			if(pos.x==0 && rota==2) {
				this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x==0 && rota==3) {
				this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.x+brk.longueurBrique==dimx-1 && rota==2) {
				this.face.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota+1,brk));
			}
			if(pos.x+brk.largeurBrique==dimx-1 && rota==3) {
				this.face.add(new BriqueEtVolume(0,pos.y,dimy-pos.y-1,(int)rota-1,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==3) {
				this.dessous.add(new BriqueEtVolume(0,dimx-brk.largeurBrique-pos.x-1,0,(int)rota+4,brk));
			}
			if(pos.y+brk.hauteurBrique==dimy-1 && rota==2) {
				this.dessous.add(new BriqueEtVolume(0,dimx-brk.longueurBrique-pos.x-1,0,(int)rota+4,brk));
			}
			if(rota==2) {
				this.dessus.add(new BriqueEtVolume(0,pos.x,dimy-(pos.y)-1-brk.hauteurBrique,(int)rota+2,brk));				
			}
			if(rota==3) {
				this.dessus.add(new BriqueEtVolume(0,pos.x,dimy-(pos.y)-1-brk.hauteurBrique,(int)rota+2,brk));
			}
		}
		if (angle==4) {
			if(pasDeBrique()==null) {
				this.dessus.add(new BriqueEtVolume(pos.x,pos.y,0,(int)rota,brk));
				if(rota==4) {
					this.dessous.add(new BriqueEtVolume(pos.x,dimx-pos.y-1-brk.longueurBrique,0,(int)rota+2,brk));
					if(pos.y==0) {
						this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,dimy-1-brk.hauteurBrique,0,7-(int)rota,brk));
					}
					if(pos.y+brk.longueurBrique==dimx-1) {
						this.face.add(new BriqueEtVolume(pos.x,dimy-1-brk.hauteurBrique,0,5-(int)rota,brk));
					}
					if(pos.x+brk.largeurBrique==dimx-1) {
						this.droit.add(new BriqueEtVolume(dimx-pos.y-brk.longueurBrique-1,dimy-1-brk.hauteurBrique,0,(int)rota-4,brk));
					}
					
				}
				if(rota==5) {
					this.dessous.add(new BriqueEtVolume(pos.x,dimx-pos.y-1-brk.largeurBrique,0,(int)rota+2,brk));
					if(pos.y==0) {
						this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,dimy-1-brk.hauteurBrique,0,7-(int)rota-2,brk));
					}
					if(pos.y+brk.largeurBrique==dimx-1) {
						this.face.add(new BriqueEtVolume(pos.x,dimy-1-brk.hauteurBrique,0,5-(int)rota,brk));
					}
					if(pos.x+brk.longueurBrique==dimx-1) {
						this.droit.add(new BriqueEtVolume(dimx-pos.y-brk.largeurBrique-1,dimy-1-brk.hauteurBrique,0,(int)rota-4,brk));
					}
				}
				if(pos.x==0) {
					this.gauche.add(new BriqueEtVolume(pos.y,dimy-1-brk.hauteurBrique,0,(int)rota-2,brk));
				}
				
			}				
			else if(pasDeBrique().z+pasDeBrique().brique.hauteurBrique+brk.hauteurBrique<dimy) {
				this.dessus.add(new BriqueEtVolume(pos.x,pos.y,pasDeBrique().z+pasDeBrique().brique.hauteurBrique,(int)rota,brk));
				if(pos.y==0 && rota==4) {
					this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.largeurBrique-1,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,7-(int)rota,brk));
				}
				if(pos.y==0 && rota==5) {
					this.derriere.add(new BriqueEtVolume(dimx-pos.x-brk.longueurBrique-1,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,7-(int)rota,brk));
				}
				if(pos.y+brk.longueurBrique==dimx-1 && rota==4) {
					this.face.add(new BriqueEtVolume(pos.x,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,5-(int)rota,brk));
				}
				if(pos.y+brk.largeurBrique==dimx-1 && rota==5) {
					this.face.add(new BriqueEtVolume(pos.x,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,5-(int)rota,brk));
				}
				if(pos.x==0) {
					this.gauche.add(new BriqueEtVolume(pos.y,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,(int)rota-2,brk));
				}
				if(pos.x+brk.largeurBrique==dimx-1 && rota==4) {
					this.droit.add(new BriqueEtVolume(dimx-pos.y-brk.longueurBrique-1,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,(int)rota-4,brk));
				}
				if(pos.x+brk.longueurBrique==dimx-1 && rota==5) {
					this.droit.add(new BriqueEtVolume(dimx-pos.y-brk.largeurBrique-1,dimy-1-brk.hauteurBrique-pasDeBrique().z,0,(int)rota-4,brk));
				}
			}	
			
			
			
			
			
		}
		repaint();
		System.out.println("face"+this.face.peek().brique.nomBrique);
		System.out.println("droit"+this.droit.peek().brique.nomBrique);
		System.out.println("derriere"+this.derriere.peek().brique.nomBrique);
		System.out.println("gauche"+this.gauche.peek().brique.nomBrique);
		System.out.println("dessus"+this.dessus.peek().brique.nomBrique);
	}
	
	public BriqueEtVolume pasDeBrique() {
		BriqueEtVolume peuxplacer=null;
		if (angle==0) {
			for (BriqueEtVolume briqueEtVolume : face) {
				for (int i = 0; i < brk.hauteurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {						
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
					for (int j = 0; j < brk.largeurBrique; j++) {						
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
			}
		}
		if (angle==1) {
			for (BriqueEtVolume briqueEtVolume : droit) {
				for (int i = 0; i < brk.hauteurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {						
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
					for (int j = 0; j < brk.largeurBrique; j++) {						
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
			}
		}
		if (angle==2) {
			for (BriqueEtVolume briqueEtVolume : derriere) {
				for (int i = 0; i < brk.hauteurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {						
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
					for (int j = 0; j < brk.largeurBrique; j++) {						
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
			}
		}
		if (angle==3) {
			for (BriqueEtVolume briqueEtVolume : gauche) {
				for (int i = 0; i < brk.hauteurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {						
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==0 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
					for (int j = 0; j < brk.largeurBrique; j++) {						
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==1 && briqueEtVolume.x<=pos.x+j && briqueEtVolume.y<=pos.y+i && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+j && briqueEtVolume.y+briqueEtVolume.brique.hauteurBrique>pos.y+i && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
			}
		}
		if (angle==4) {
			for (BriqueEtVolume briqueEtVolume : dessus) {
				for (int i = 0; i < brk.largeurBrique; i++) {
					for (int j = 0; j < brk.longueurBrique; j++) {						
						if (rota%2==0 && briqueEtVolume.x<=pos.x+i && briqueEtVolume.y<=pos.y+j && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+i && briqueEtVolume.y+briqueEtVolume.brique.longueurBrique>pos.y+j && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==0 && briqueEtVolume.x<=pos.x+i && briqueEtVolume.y<=pos.y+j && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+i && briqueEtVolume.y+briqueEtVolume.brique.largeurBrique>pos.y+j && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
				for (int i = 0; i < brk.longueurBrique; i++) {
					for (int j = 0; j < brk.largeurBrique; j++) {						
						if (rota%2==1 && briqueEtVolume.x<=pos.x+i && briqueEtVolume.y<=pos.y+j && briqueEtVolume.x+briqueEtVolume.brique.largeurBrique>pos.x+i && briqueEtVolume.y+briqueEtVolume.brique.longueurBrique>pos.y+j && briqueEtVolume.o%2==0) {
							peuxplacer=briqueEtVolume;
						}
						if (rota%2==1 && briqueEtVolume.x<=pos.x+i && briqueEtVolume.y<=pos.y+j && briqueEtVolume.x+briqueEtVolume.brique.longueurBrique>pos.x+i && briqueEtVolume.y+briqueEtVolume.brique.largeurBrique>pos.y+j && briqueEtVolume.o%2==1) {
							peuxplacer=briqueEtVolume;
						}
					}
				}
			}
		}
		System.out.println(peuxplacer==null);
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
					
					if (pasDeBrique()==null && angle<4 && pos.y+brk.hauteurBrique<dimy && ((pos.x+brk.largeurBrique<dimx && rota%2==1) || (pos.x+brk.longueurBrique<dimx && rota%2==0))) {
						Sauvegarde();
					}
					if (angle>3 && angle<6 && (pos.x+brk.largeurBrique<dimx && pos.y+brk.longueurBrique<dimx && rota%2==0 ||pos.x+brk.longueurBrique<dimx && pos.y+brk.largeurBrique<dimx && rota%2==1 )) {
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

import java.awt.Color;
import java.io.File;

public class listeBriqueConstruction {

		static final int Capacity = 10;
		
		private int mCapacity;
		private int mFirst, mSize;
		public BriqueEtVolume[] mData;
		
		public listeBriqueConstruction() {
			this(Capacity);
		}
		
		public listeBriqueConstruction(int capacity) {
			mCapacity = capacity;
			mFirst = mSize = 0;
			mData = new BriqueEtVolume[mCapacity];
		}
		
		public boolean estVide() {
			return mSize == 0;
		}
		
		@SuppressWarnings("unchecked")
		public BriqueEtVolume premier(){
			if (this.estVide()) {
				return (BriqueEtVolume)null;
			}
			else {
				return mData[mFirst];				
			}
		}
		
		public void enfiler(BriqueEtVolume element){
			if (mSize > mCapacity) {
				System.out.println("la capacite est pleine");
			}
			else {
				mData[(mFirst + mSize) % mCapacity] = element;			
				++mSize;
			}
		}
		public void defiler(){
			if (this.estVide()) {
				System.out.println("la liste est deja vide");
			}
			else {
				++mFirst;
				--mSize;	
			}
		}
		
		public static void main(String[] args) {
			listeBriqueConstruction l = new listeBriqueConstruction();
			l.enfiler(new BriqueEtVolume(0,0,0,new Brique("2x2", 100, 2, 2, 1, Color.red)));
			l.enfiler(new BriqueEtVolume(0,0,0,new Brique("3x2", 100, 3, 2, 1, Color.orange)));
			System.out.println(l.premier().brique.nomBrique);
			System.out.println(l.estVide());
			l.defiler();
			System.out.println(l.premier().brique.nomBrique);
			l.defiler();
			System.out.println(l.estVide());
		}
		
}


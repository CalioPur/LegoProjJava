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
			//System.out.printf("(enfiler) mFirst=%d, mSize=%d\n", mFirst, mSize);
		}
		public void défiler(){
			if (this.estVide()) {
				System.out.println("la liste est deja vide");
			}
			else {
				++mFirst;
				--mSize;	
			}
			//System.out.printf("(défiler) mFirst=%d, mSize=%d\n", mFirst, mSize);
		}
	}


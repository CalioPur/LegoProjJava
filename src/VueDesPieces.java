
import java.awt.Canvas;

import java.util.Observable;
import java.util.Observer;

public class VueDesPieces extends Canvas implements Observer{
	public VueDesPieces() {
		super();
		Canvas cnv = new Canvas();
		cnv.setSize(500, 500);
		cnv.setVisible(true);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}

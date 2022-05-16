import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class BriqueFactory implements Serializable{
	String fullSize;
	int width;
	int length;
	int height;
	HashMap<Integer,String> colors;
	
	public BriqueFactory(String fullSize, int width, int length, int height, HashMap<Integer, String> colors) {
		super();
		this.fullSize = fullSize;
		this.width = width;
		this.length = length;
		this.height = height;
		this.colors = colors;
	}
	
	public ArrayList<Brique> buildSetOfBrique() {
		ArrayList<Brique> setOfBrique = new ArrayList<>();
		Brique newBrique;
		Color newColor;
		for (int briqueId : this.colors.keySet()) {
			newColor= colorOfBrique(this.colors.get(briqueId));
			newBrique = new Brique(this.fullSize, briqueId, this.length, this.width, this.height,newColor);
			setOfBrique.add(newBrique);
		}
		return setOfBrique;
	}
	
	public Color colorOfBrique(String colorName) {
		switch(colorName) {
		case "white":
			return Color.white;
		case "blue":
			return Color.blue;
		case "yellow":
			return Color.yellow;
		case "green":
			return Color.green;
		case "cyan":
			return Color.cyan;
		case "pink":
			return Color.pink;
		case "black":
			return Color.black;
		case "gray":
			return Color.gray;
		case "red":
			return Color.red;
		case "orange":
			return Color.orange;
		default:
			return Color.white;
		}
	}
	
	public String getFullSize() {
		return fullSize;
	}
	public void setFullSize(String fullSize) {
		this.fullSize = fullSize;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public HashMap<Integer, String> getColors() {
		return colors;
	}
	public void setColors(HashMap<Integer, String> colors) {
		this.colors = colors;
	}
	
}

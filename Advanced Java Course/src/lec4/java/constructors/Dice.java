package lec4.java.constructors;

public class Dice {
	private int faces;

	public Dice(int numOfFaces) {
		faces = numOfFaces;
	}

    // Returns a number between 1 and faces
	public int roll(){
		return (int)(Math.random()*faces)+1; 
	}
}

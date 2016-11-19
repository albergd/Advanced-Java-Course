package lec4.java.constructors;

public class Player {
	private String name;
	private int score;
	
	public Player(String playerName){
		name = playerName;
		score = 0;
	}
	
	public String toString() {
		return "Player: " + name + ", score: " + score;
	}	
	/* adds points to player score and returns its new value */
	public int addPoints(int points){
		score = score + points;
		return score;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getName(){
		return name;
	}
}

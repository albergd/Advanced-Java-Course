package lec4.java.constructors;

public class Game {
	private Player firstPlayer, secondPlayer; //players
	private Dice roundTypeDie, pointsDie;      

	public Game(Player p1, Player p2){
		firstPlayer = p1; 
		secondPlayer = p2;
		roundTypeDie = new Dice(3);
		pointsDie = new Dice(100);
	}

	public Player randomPlay() {
		int roundType;

		for (int round = 0; round < 10; round = round + 1) {
			System.out.println("\n------------ " + (round + 1)+ " ------------");
			roundType = roundTypeDie.roll();
			if (roundType == 1) {
				takePoints(firstPlayer);
			} else if (roundType == 2) {
				takePoints(secondPlayer);
			} else {
				addPoints(firstPlayer);
				addPoints(secondPlayer);
			}
			System.out.print("TOTAL: " + firstPlayer.toString()+ ",\t"+ secondPlayer.toString());
		} // next round
		return findWinner();
	}

	private void takePoints(Player p) {
		int dieResult = pointsDie.roll();
		p.addPoints(-dieResult);
		System.out.println(p.getName() + " lost " + dieResult + " points.");
	}

	private void addPoints(Player p) {
		int dieResult = pointsDie.roll();
		p.addPoints(dieResult);
		System.out.println(p.getName() + " won " + dieResult + " points.");
	}

	private Player findWinner() {
		if (firstPlayer.getScore() > secondPlayer.getScore()) {
			return firstPlayer;
		} else {
			return secondPlayer;
		}

	}
}

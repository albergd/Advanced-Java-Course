package lec4.java.constructors;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1, p2, winner;
        p1 = new Player("Bob");
        p2 = new Player("Alice");

        Game game = new Game(p1, p2);

        winner = game.randomPlay(); // play the game
        System.out.println("\nThe winner is "+ winner.toString());

	}

}

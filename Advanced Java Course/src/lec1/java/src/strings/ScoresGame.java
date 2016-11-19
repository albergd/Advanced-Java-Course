package lec1.java.src.strings;

import java.util.Scanner;

public class ScoresGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Tell me Bowdoin score:");
		String score1 = in.nextLine();
		System.out.print("Tell me Bates score:");
		String score2 = in.nextLine();
		in.close();
		
		String result;
		if(Integer.valueOf(score1)>Integer.valueOf(score2)){
			result = "Congratulations, Bowdoin won!!";		
		} else if(Integer.valueOf(score1) == Integer.valueOf(score2))  {
			result = "Congratulations, is draw!!";
		} else {
			result = "Congratulations, Bates won!!";
		}
		
		System.out.println(result); 
		System.out.println("Goodbye."); 
		
	}

}

package lec1.java.src.strings;

import java.util.Scanner;

public class NameFinder {

	public static void main(String[] args) {			
		int counter = 1;	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the candidate name: ");
		String candidate = in.nextLine();

		System.out.print("Enter first winner name: ");	
		String winner = in.nextLine();
		
		while (candidate.compareTo(winner) > 0)
		{
			counter++;
			System.out.print("Enter next first winner name: ");
			winner = in.nextLine();
		} 
		
		in.close();
		
		if (candidate.equals(winner))
			System.out.printf("%s is accepted", candidate);
		else
			System.out.printf("%s is not accepted", candidate);
		
		System.out.printf("\n%d Names", counter);

	}

}

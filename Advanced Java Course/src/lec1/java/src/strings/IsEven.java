package lec1.java.src.strings;
import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		char letter;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = in.nextLine();
		in.close();
		int len = str.length();
		if (len % 2 == 0)
		letter = str.charAt(0);
		else
		letter = str.charAt(len - 1);
		System.out.println("The letter is:" + letter);
	}
}

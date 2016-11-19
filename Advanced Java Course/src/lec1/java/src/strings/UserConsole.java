package lec1.java.src.strings;

import java.util.Scanner;
public class UserConsole {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner con = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = con.next();
		name = name.toUpperCase();
		System.out.println(name + " has " + name.length() + 
		    " letters and starts with " + name.substring(0, 1));
		con.close();
	}
}

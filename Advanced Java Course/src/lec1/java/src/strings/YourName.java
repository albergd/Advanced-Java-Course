package lec1.java.src.strings;

import java.util.Scanner;
public class YourName {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//הוראת קלט + הקצאת מקום בזיכרון 
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		in.close();
		//פלט
		System.out.println("Your name is: " + name);
		String s = name.substring(0, 1);
		System.out.print(s);
	}
}

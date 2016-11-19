/**
 * 
 */
package lec1.java.src.strings;
import java.util.Scanner;

public class GasConsGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the start mileage of your trip:");
		String start = in.nextLine();
		System.out.print("Enter the end mileage of your trip:");
		String end = in.nextLine();
		System.out.print("Enter the number of gallons you filled the tank:");
		String tank = in.nextLine();	
		in.close();
		
		Double result = (Double.parseDouble(end) - Double.parseDouble(start))/(Double.parseDouble(tank));
		System.out.println("Your car gives " + String.format("%.2f", result) +" miles-per-gallon. Congratulations!!");
		System.out.println("Goodbye.");
	}

}

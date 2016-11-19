package lec1.java.src.strings;

import java.util.Scanner;

public class Questions {
	
	//Question 1
	public static void SayName(){
		//String name;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = in.nextLine();
		in.close();
		System.out.println("Your name is:" + name +".");		
	}
	
	//Question 2
	public static void EvenLetter(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your word:");
		String word = in.nextLine();
		in.close();
		int len = word.length();
		char letter;
		if (len % 2 == 0) {
			letter = word.charAt(0);
		} else {
			letter = word.charAt(len - 1);
		}
		System.out.println("Result letter is:" + letter);		
	}
	
	//Question 3 [+]
	public static boolean EqualLetters(String word){
		boolean result = true;
		int len = word.length();
		if (word.charAt(0) != word.charAt(len - 1)) result = false;
		return result;	
	}
	
	//Question 3
	public static void EqualLettersWordsCount(int loops){
		int res = 0;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<loops;i++){
			System.out.print("Enter your " + (i+1) +" word:");					
			String word = in.nextLine();
			if (EqualLetters(word)) res++;		
		}
		in.close();
		System.out.println("Result:"+res);
	}
	
	//Question 4
	public static void CountChar(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your word:");
		String word = in.nextLine();
		System.out.print("Enter your letter:");
		String letter = in.nextLine();
		in.close();
		
		int len = word.length();
		int cnt = 0;
		
		for(int i = 0; i<len; i++){
			char temp = word.charAt(i);
			String text = Character.toString(temp).toLowerCase();
			if(text.equals(letter.toLowerCase())) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	//Question 5
	public static void OrganizationUrl(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your url:");
		String url = in.nextLine();
		in.close();
		
		String result;
		result = url.substring(4, url.length()-4);
		System.out.println(result);
	}
	
	//Question 6
	public static void CompareWords(){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first word:");
		String w1 = in.nextLine();
		System.out.print("Enter your second word:");
		String w2 = in.nextLine();
		in.close();
		
		
		int compare = (w1.toLowerCase()).compareTo(w2.toLowerCase());
		if (compare < 0){
		    System.out.println(w1 + " is before " + w2);
		}
		else if (compare > 0) {
		    System.out.println(w2 + " is before " + w1);
		}
		else {
		    System.out.println(w1 + " is same as "+ w2);
		}
		
	}
	
	//Question 8
	public static void FindChar(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your word:");
		String w = in.nextLine();
		System.out.print("Find letter:");
		String f = in.nextLine();
		in.close();
		
		boolean res = false;
		int l = w.length();
		
		for(int i = 0; i < l; i++) {
			char c = w.charAt(i);
			String s = Character.toString(c);
			if(s.equals(f)) {
				res = true;
				break;
			}
		}
		
		if(res) {
			System.out.printf("Letter %s exists in word %s", f, w);
		} else {			
			System.out.printf("Letter %s does not exists in word %s", f, w);
		}
							
	}
	
	//Question 9
	public static void ReverseWord(){
		String r ="";   
		int e;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your word:");
		String w = in.nextLine();
		in.close();
          
		int l = w.length();
		
		for(int i = 0; i < l; i++) {
			e = (l-1) - i;
			char c = w.charAt(e);
			String s = Character.toString(c);
			r = r + s;
		}
		
		 System.out.println(r);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name();
		//Even();
		//Equals(5);
		//CountChar();
		//Organization();
		//Compare();
		//RevWrd();
		FindChar();
	}

}

package lec1.java.src.strings;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
	    String str2 = new String(); // empty row
	    String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
	    String str4 = new String(new char[] 
	    		                {'w', 'e', 'l', 'c', 'o', 'm', 'e'},
	    		                 3, 4);//3 - first index, 4 - number of symbols
	         
	    System.out.println(str1);          // Java
	    System.out.println(str2);          // Empty row
	    System.out.println(str3);          // hello
	    System.out.println(str4);          // come	    
	    System.out.println(str1.length()); // 4
	    
	    char[] helloArray = str3.toCharArray();
	    System.out.println(helloArray);    //hello
	    String s1 = "dr";
	    //String s2 = "el";
	    char c3 ='g';
	    s1 = s1 + c3;
	    System.out.println(s1);
	}

}

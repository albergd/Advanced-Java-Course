package lec7.java.src.statics;

public class TestId {
	public static void main(String[] args) {
	/*System.out.println(Person.getNumOfPersons()+" persons have been created");
	Person p1 = new Person("Anna", 14);
	System.out.println(p1.getNumOfPersons()+" persons have been created");
	Person p2 = new Person("Funny", 23);
	System.out.println(p2.getNumOfPersons()+" persons have been created");	
	System.out.println(p1.toString() );
	System.out.println(p2.toString() );
	}*/
	    
		Person p1 = new Person("Yossi", 14);
	    System.out.println(p1.toString());
	    System.out.println(p1.getNumOfPersons() 
	    		+  " persons have been created");
	    Person p2 = new Person("Shlomo", 23);
	    System.out.println(p2.toString());
	    System.out.println(p1.getNumOfPersons() 
	    		+ " persons have been created");
	    System.out.println(p2.getNumOfPersons() 
	    		+ " persons have been created");
	    
	    
	    Math.abs(6);
	}
}

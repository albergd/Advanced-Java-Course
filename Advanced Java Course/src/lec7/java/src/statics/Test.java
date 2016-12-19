package lec7.java.src.statics;

public class Test {

	public static void main(String[] args) {		
	//System.out.println("Adult age is:" + Person.LICENSE_AGE);
		/*Person p1 = new Person("Moshe", 14);
	            Person p2 = new Person("Lars", 23);
	            Person p3 = new Person("Sid", 19);
	            p1. setLicenseAge(18); 

	            System.out.println(p1.toString());
	            System.out.println(p2.toString());
	            System.out.println(p3.toString());

	            System.out.println("Changing adult age to be 21:");
	            p2.setLicenseAge(21); 
	            System.out.println(p1.toString());
	            System.out.println(p2.toString());
	            System.out.println(p3.toString());*/
	            
	            System.out.println("Adult age is:" + Person3.LICENSE_AGE);
	            Person3 p1 = new Person3("John", 15);
	            Person3 p2 = new Person3("Anna", 29);
	            Person3 p3 = new Person3("Yossi", 19);

	            System.out.println(p1.toString());
	            System.out.println(p2.toString());
	            System.out.println(p3.toString());


	}

}

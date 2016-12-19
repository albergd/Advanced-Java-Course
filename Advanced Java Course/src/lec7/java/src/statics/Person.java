package lec7.java.src.statics;

public class Person {
	private static int counter;
    private String name;
    private int age;
    private int id;

    public Person(String name, int age)  {
        this.name = name;
        this.age = age;
        this.id = ++counter;
    }

    public int getNumOfPersons()    {
        return counter;
    }

    public String toString()    {
        String str = "";
        str += "Id:  " + id;
        str += "\tName:  " + name;
        str += "\tAge:  " + age;
        return str;
    }

}

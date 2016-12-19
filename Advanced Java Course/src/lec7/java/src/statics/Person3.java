package lec7.java.src.statics;

public class Person3 {
	public  static final  int  LICENSE_AGE = 18;
    //private  static  int  licenseAge;
    private  String  name;
    private  int  age;

    public Person3(String name, int age)   {
        this.name = name;
        this.age = age;
    }
    
    /*public void setLicenseAge(int age)  {
        licenseAge = age; 
     }*/
 
    public String toString()   {
        String str = "";
        str += "Name:  " + name;
        str += "\tAge:  " + age + " => Decision: ";
        if (age < LICENSE_AGE)
        //if (age < licenseAge )
            str += "can not drive";
        else
            str += "can drive";
      
        return str;
    }
}

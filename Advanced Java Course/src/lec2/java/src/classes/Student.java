package lec2.java.src.classes;

public class Student {
	private String name;
	private int grade;
	
	/**
	 * @param name
	 * @param grade
	 */
	public Student(String name, int grade) {
		//super(); //for inheritance only
		this.name = name;
		this.grade = grade;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	public String printGrade() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
}

package lec2.java.src.classes;

class Base {
	private int base_num;
	
	public Base(int num) {
		this.base_num = num;
	}
	
	public Base() {
			this.base_num = 10;
	}
	
	public String toString() {
		return String.format("Base [base_num=%s]", base_num);
	}
	
	
}

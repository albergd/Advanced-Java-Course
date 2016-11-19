package lec2.java.src.classes;

class Derived extends Base {
	private int derived_num;

	public Derived(int b_num, int d_num) {
		super(b_num);
		this.derived_num = d_num;
	}
	
	public Derived() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Derived [derived_num=%s], [base_num ]", derived_num);
	}

	public static void main(String[] args) {	
		Derived d = new Derived();
		System.out.println(d.toString());
	}
	
	
}

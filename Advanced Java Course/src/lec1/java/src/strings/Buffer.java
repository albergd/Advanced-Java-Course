package lec1.java.src.strings;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		StringBuffer strBuffer = new StringBuffer(str);
		System.out.println("Capacity: " + strBuffer.capacity()); // 20
		strBuffer.ensureCapacity(32);
		System.out.println("Capacity: " + strBuffer.capacity()); // 42
		System.out.println("Length: " + strBuffer.length());     // 4
		System.out.println(strBuffer.toString());                // Java
	}

}

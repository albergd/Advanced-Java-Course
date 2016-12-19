package lec6.java.src.composition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=====================================================
		/*Point   p1 = new Point(1, 1);
        Circle1  c1 = new Circle1(p1, 5);
        System.out.print("c is -> " + c1.toString());
        p1.setX(0);
        System.out.println("c is now -> " + c1.toString());
		//=====================================================
      	Point   p2 = new Point(1, 1);
        Circle2  c2 = new Circle2(p2, 5);
        System.out.print("c is -> " + c2.toString());
        p2.setX(0);
        System.out.println("c is now -> " + c2.toString());
        //=====================================================
        Point   p3 = new Point(1, 1);
        Circle3  c3 = new Circle3(p3, 5);
        System.out.print("c is -> " + c3.toString());
        p3.setX(0);
        System.out.println("c is now -> " + c3.toString());*/
        //=====================================================
        
        /*Point   p1 = new Point(1, 1);
        Circle4  c1 = new Circle4(p1, 5);
        System.out.println("p1 is -> " + p1.toString());
        System.out.println("c1 is now -> " + c1.toString());
        
        Point   p2 = new Point(2, 2);
        c1.setCenter(p2);
        System.out.println("p2 is -> " + p2.toString());
        System.out.println("c1 is now -> " + c1.toString());
        
        p2.setX(3);
        System.out.println("p2 is -> " + p2.toString());
        System.out.println("c1 is now -> " + c1.toString());
		
		Point   p1 = new Point(1, 1);
        Circle4  c1 = new Circle4(p1, 5);
        System.out.println("p1 is -> " + p1.toString());
        System.out.println("c1 is now -> " + c1.toString());
        
        Point p2 = c1.getCenter();
        p1.setX(3);
        System.out.println("p2 is -> " + p1.toString());
        System.out.println("c1 is now -> " + c1.toString());*/
        
		Point   p1 = new Point(1, 1);
		Circle  c1 = new Circle(p1, 5);
		System.out.println("1) p1 is -> " + p1.toString());
        System.out.println("1) c1 is now -> " + c1.toString());
        
        p1.setX(5);
        System.out.println("2) p1 is -> " + p1.toString());
        System.out.println("2) c1 is now -> " + c1.toString());
        
        Point p2 = c1.getCenter();
        p2.setX(3);
        System.out.println("3) p2 is -> " + p2.toString());
        System.out.println("3) c1 is now -> " + c1.toString());
        
        c1.getCenter().setX(4);
        System.out.println("4) c1 is now -> " + c1.toString());
        
        
	}

}

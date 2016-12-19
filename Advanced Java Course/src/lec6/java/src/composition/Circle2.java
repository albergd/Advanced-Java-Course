package lec6.java.src.composition;

public class Circle2 {
	private Point center;
    private  int  radius;

    public Circle2(Point  p, int  radius) {
        center = new Point(p);
        this.radius = radius;
    }

    public String toString()        {
        String str = "";
        str += "Center2:" +  center.toString();
        str += "  Radius2:" +  radius  + "\n";
        return str;
    }

}

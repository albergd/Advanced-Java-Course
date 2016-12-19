package lec6.java.src.composition;

public class Circle1 {
	private Point center;
    private  int  radius;

    public Circle1(Point  p, int  radius) {
        center = p;
        this.radius = radius;
    }

    public String toString()        {
        String str = "";
        str += "Center1:" +  center.toString();
        str += "  Radius1:" +  radius  + "\n";
        return str;
    }

}

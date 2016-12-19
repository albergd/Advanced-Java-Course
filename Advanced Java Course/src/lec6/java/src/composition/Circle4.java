package lec6.java.src.composition;

public class Circle4 {
	private Point center;
    private  int  radius;

    public Circle4(Point  p, int  radius) {
        center = new Point(p);
        this.radius = radius;
    }

    public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = new Point(center);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString()        {
        String str = "";
        str += "Center3:" +  center.toString();
        str += "  Radius3:" +  radius  + "\n";
        return str;
    }

}

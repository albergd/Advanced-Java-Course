package lec6.java.src.composition;

public class Circle {

    private Point center;
    private  int  radius;

    public Circle(Point  p, int  radius) {
        setCenter(p);
        this.radius = radius;
    }

   public void setCenter(Point p){
        this.center = new Point(p);
    }

    public Point getCenter(){
        return center;
     }

    public String toString()        {
        String str = "";
        str += "Center:"   +  center.toString();                               
        str += "  Radius:" +  radius  + "\n";
        return str;
    }

	
}

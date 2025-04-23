class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";

    }
}
abstract class Shape{
    Point center;
    Shape(Point center){
        this.center=center;
    }
    public Point getCenter(){
        return center;
    }
    public abstract boolean contains(Point p);
    public abstract String  toString();

}
    class Circle extends Shape{
        double radius;
        Circle(Point center,double radius){
            super(center);
            this.radius=radius;

        }
        public boolean contains(Point p){
            double distance=Math.sqrt(Math.pow(p.x-center.x,2)+Math.pow(p.y-center.y,2));
            return distance<=radius;
        }
        public String toString() {
            return "Circle with center " + center + " and radius " + radius;
        }
    }
    class Rectangle extends Shape{
        double length;
        double width;
        Rectangle(Point center,double length,double width){
            super(center);
            this.length=length;
            this.width=width;
        }
        public boolean contains(Point p) {
            double halfLength = length / 2.0;
            double halfWidth = width / 2.0;

            return p.x >= (center.x - halfLength) && p.x <= (center.x + halfLength) &&
                    p.y >= (center.y - halfWidth) && p.y <= (center.y + halfWidth);
        }
        public String toString() {
            return "Rectangle with center " + center + ", length " + length + ", and width " + width;
        }
    }


public class Lab7Task2 {
    public static void main(String[] args) {
        Point circleCenter=new Point(0,0);
        Shape Circle=new Circle(circleCenter,5);

        Point rectangleCenter=new Point(2,2);
        Shape Rectangle=new Rectangle(rectangleCenter,4,6);
        Point testPoint1 = new Point(3,3);
        Point testPoint2 = new Point(6,6);

        System.out.println(Circle.toString());
        System.out.println("Contains " + testPoint1 + ": " + Circle.contains(testPoint1));
        System.out.println("Contains " + testPoint2 + ": " + Circle.contains(testPoint2));

        System.out.println(Rectangle.toString());
        System.out.println("Contains " + testPoint1 + ": " + Rectangle.contains(testPoint1));
        System.out.println("Contains " + testPoint2 + ": " + Rectangle.contains(testPoint2));



    }
}

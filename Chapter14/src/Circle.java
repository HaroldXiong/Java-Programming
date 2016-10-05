/**
 * Created by xiong on 10/5/16.
 */
public class Circle extends GeometricObject {
    protected double radius;

    public Circle() {
        this("White",1.0,1.0);
    }

    public Circle(double radius) {
        super("White",1.0);
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.getRadius();
    }

    @Override
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    @Override
    public int compareTo(Object o) {
        if (getRadius() > ((Circle)o).getRadius())
            return 1;
        else if (getRadius() < ((Circle)o).getRadius())
            return -1;
        else
            return 0;

    }
}

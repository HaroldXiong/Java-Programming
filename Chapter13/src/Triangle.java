/**
 * Created by xiong on 10/3/16.
 */
public class Triangle {
    double side1, side2, side3;
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 ||
                side2 + side3 <= side1)
            throw new IllegalTriangleException(
                    "The sum of any two sides is greater than the other side");
    }
    public double findArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double findPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

}

/**
 * Created by xiong on 9/27/16.
 */
public class P1 {
    static Rectangular r1 = new Rectangular(4, 40);
    static Rectangular r2 = new Rectangular(3.5, 35.9);

    public static void main(String[] args) {
        System.out.println("r1's width is " + r1.width
                + ", r1's height is " + r1.height
                + ", r1's area is " + r1.getArea()
                + ", r1's perimeter is " + r1.getPerimeter());
        System.out.println("r2's width is " + r2.width
                + ", r2's height is " + r2.height
                + ", r2's area is " + ((int) (r2.getArea() * 10)) / 10.0
                + ", r2's perimeter is " + r2.getPerimeter());
    }
}

class Rectangular {
    double width = 1;
    double height = 1;

    Rectangular() {
    }

    Rectangular(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

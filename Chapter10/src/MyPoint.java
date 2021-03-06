/**
 * Created by xiong on 10/1/16.
 */
public class MyPoint {
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0, 0);
    }

    public double distance(MyPoint secondPoint) {
        return distance(this, secondPoint);
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
                (p1.y - p2.y) * (p1.y - p2.y));
    }

}

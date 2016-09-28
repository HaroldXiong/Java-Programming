/**
 * Created by xiong on 9/28/16.
 */
public class P9 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " +
                polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " +
                polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " +
                polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getN() {

        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.setX(0);
        this.setY(0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return this.getN() * this.getSide();
    }

    public double getArea() {
        return (this.getN() * this.getSide()
                * this.getSide()) /
                (4 * Math.tan(Math.PI / this.getN()));
    }
}
/**
 * Created by xiong on 10/5/16.
 */
public abstract class GeometricObject implements Comparable {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        color = "White";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();

    public abstract double findPerimeter();

    public static Comparable max(Comparable o1, Comparable o2){
        if (o1.compareTo(o2) > 0) {
            return o1;
        } else {
            return o2;
        }
    }
}

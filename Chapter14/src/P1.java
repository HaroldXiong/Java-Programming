/**
 * Created by xiong on 10/5/16.
 */
public class P1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);

        Circle circle = (Circle)GeometricObject.max(circle1, circle2);
        System.out.println("The max circle's radius is " +
                circle.getRadius());
        System.out.println(circle);
    }

}

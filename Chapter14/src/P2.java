/**
 * Created by xiong on 10/5/16.
 */
public class P2 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(10);
        ComparableCircle circle2 = new ComparableCircle(15);

        ComparableCircle circle3 = (ComparableCircle) Max.max(circle1, circle2);
        System.out.println("The max circle's radius is " + circle3.getRadius());
        System.out.println(circle3);
    }
}

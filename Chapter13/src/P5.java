/**
 * Created by xiong on 10/3/16.
 */
public class P5 {
    public static void main(String[] args) {
        new P5();
    }

    public P5() {
        try {
            new Triangle(1, 2, 3);
        } catch (IllegalTriangleException ex) {
            ex.printStackTrace();
        }
    }
}

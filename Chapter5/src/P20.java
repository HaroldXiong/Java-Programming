/**
 * Created by Xiong on 9/13/2016.
 */
public class P20 {
    public static void main(String[] args) {
        System.out.println("Degree\tSin\t\t\tCos");

        for (int degree = 0; degree <= 360; degree += 10) {
            System.out.printf("%-6d\t%3.4f\t\t%6.4f", degree,
                    Math.sin(degree * Math.PI / 180),
                    Math.cos(degree * Math.PI / 180));
            System.out.println();
        }
    }
}

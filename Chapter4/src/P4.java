/**
 * Created by Xiong on 2016/8/29.
 */
public class P4 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tkilometers");
        System.out.println("----------------------");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("%-5d\t\t%10.3f\n", mile, mile * 1.609);
        }
    }
}

/**
 * Created by Xiong on 2016/8/29.
 */
public class P3 {
    public static void main(String[] args) {
        System.out.println("kilograms\tpounds");
        int kilograms;
        for (kilograms = 1; kilograms <= 200; kilograms += 2) {
            System.out.printf("%-4d\t\t%6.1f\n",
                    kilograms, (kilograms * 22) / 10.0);
        }
    }
}

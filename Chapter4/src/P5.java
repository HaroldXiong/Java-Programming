/**
 * Created by Xiong on 2016/8/30.
 */
public class P5 {
    public static void main(String[] args) {
        System.out.println("kilograms\t\tpounds" +
                "\t\tpounds\t\tkilograms");
        for (int kilograms = 1, pounds = 20;
             kilograms < 200; kilograms += 2, pounds += 5) {
            System.out.printf("%-9d\t\t%-6.1f\t\t%-6d\t\t%-9.2f\n",
                    kilograms, kilograms * 2.2, pounds, pounds / 2.2);
        }
    }
}

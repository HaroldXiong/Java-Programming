/**
 * Created by Xiong on 9/9/2016.
 */
public class P45 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i != j) {
                    System.out.println(i + ", " + j);
                    count++;
                }
            }
        }
        System.out.println(count + "pairs");
    }
}

/**
 * Created by Xiong on 9/4/2016.
 */
public class P27 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2001; i <= 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.print(i + "\t");
                count++;
                if (count != 0 && count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

import java.util.Random;

/**
 * Created by xiong on 9/28/16.
 */
public class P4 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }
}

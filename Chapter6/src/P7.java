/**
 * Created by xiong on 9/18/16.
 */
public class P7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int temp = (int) (Math.random() * 10);
            counts[temp]++;
        }
        for (int i : counts) {
            System.out.print(i + " ");
        }
    }
}

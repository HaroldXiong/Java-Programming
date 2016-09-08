/**
 * Created by Xiong on 9/8/2016.
 */
public class P40 {
    public static void main(String[] args) {
        int faceUp = 0;
        int faceDown = 0;
        for (int i = 0; i < 1000000; i++) {
            int k = (int) (Math.random() * 2);
            if (k == 0) {
                faceUp++;
            } else {
                faceDown++;
            }
        }
        System.out.println("Face up is " + faceUp + "times");
        System.out.println("Face down is " + faceDown + " times");
    }

}

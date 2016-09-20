/**
 * Created by xiong on 9/20/16.
 */
public class P23 {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];
        int numberOfStudents = 100;
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = i; j < locker.length; j++) {
                boolean temp = locker[j];
                locker[j] = !temp;
            }
        }

        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

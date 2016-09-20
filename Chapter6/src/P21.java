import java.util.Scanner;

/**
 * Created by xiong on 9/20/16.
 */
public class P21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop: ");
        int numbersOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();
        int[] holes = new int[slots + 1];
        for (int i = 0; i < numbersOfBalls; i++) {
            char[] temp = beansMachine(slots);
            System.out.println(temp);
            holes[holesOfBeans(temp)]++;
        }
        System.out.println();
        printHistogram(holes);
    }

    public static void printHistogram(int[] holes) {
        int maxSlotHeight = max(holes);
        for (int h = maxSlotHeight; h > 0; h--) {
            for (int i = 0; i < holes.length; i++) {
                if (holes[i] < h) {
                    System.out.print(" ");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static int max(int[] holes) {
        int result = holes[0];
        for (int i = 1; i < holes.length; i++) {
            if (result < holes[i])
                result = holes[i];
        }
        return result;
    }

    public static int holesOfBeans(char[] temp) {
        int sum = 0;
        for (char n : temp) {
            if (n == 'L') {
                sum += 0;
            } else {
                sum += 1;
            }
        }
        return sum;
    }

    public static char[] beansMachine(int slots) {
        char[] sequence = new char[slots];
        for (int i = 0; i < slots; i++) {
            sequence[i] = beansProduce();
        }
        return sequence;
    }

    public static char beansProduce() {
        int bean = (int) (Math.random() * 2);
        return (bean == 1) ? 'L' : 'R';
    }
}

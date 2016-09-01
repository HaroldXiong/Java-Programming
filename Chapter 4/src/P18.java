import java.util.Scanner;

/**
 * Created by Xiong on 2016/9/1.
 */
public class P18 {
    public static void main(String[] args) {
        System.out.println("Enter an integer from 1 to 4 to print a pattern.");
        Scanner input = new Scanner(System.in);
        int pattern = input.nextInt();

        switch (pattern) {
            case 1:
                pattern1();
                break;
            case 2:
                pattern2();
                break;
            case 3:
                pattern3();
                break;
            case 4:
                pattern4();
                break;
        }
    }

    private static void pattern1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static void pattern2() {
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int num = i; num > 0; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void pattern4() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

/**
 * Created by xiong on 10/3/16.
 */
public class P3 {
    public static void main(String[] args) {
        int[] number = new int[100];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 10000);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index: ");
        int index = input.nextInt();
        try {
            System.out.println("The element is " + number[index]);
        } catch (Exception ex) {
            System.out.println("Index out of bound.");
        }
    }
}

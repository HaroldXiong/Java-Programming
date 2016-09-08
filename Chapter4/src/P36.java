import java.util.Scanner;

/**
 * Created by Xiong on 9/8/2016.
 */
public class P36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 numbers of ISBN: ");
        int first9OfISBN = input.nextInt();

        int t = first9OfISBN;
        int i = 9;
        int sum = 0;

        while (t != 0) {
            sum += (t % 10) * i;
            i--;
            t = t / 10;
        }

        int checksum = sum % 11;

        System.out.print("The ISBN number is ");

        int temp = 100000000;
        while (first9OfISBN / temp == 0) {
            System.out.print("0");
            temp = temp / 10;
        }

        System.out.print(first9OfISBN);

        if (checksum == 10)
            System.out.print("X");
        else
            System.out.print(checksum);
    }
}

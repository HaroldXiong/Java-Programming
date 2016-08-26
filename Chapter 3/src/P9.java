import java.util.Scanner;

/**
 * Created by xiong on 8/23/16.
 */
public class P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 numbers of ISBN: ");
        int first9OfISBN = input.nextInt();
        int checknum =
                ((first9OfISBN / 100000000 % 10) * 1
                        + (first9OfISBN / 10000000 % 10) * 2
                        + (first9OfISBN / 1000000 % 10) * 3
                        + (first9OfISBN / 100000 % 10) * 4
                        + (first9OfISBN / 10000 % 10) * 5
                        + (first9OfISBN / 1000 % 10) * 6
                        + (first9OfISBN / 100 % 10) * 7
                        + (first9OfISBN / 10 % 10) * 8
                        + (first9OfISBN % 10) * 9) % 11;
        System.out.print("The ISBN number is: ");
        if (first9OfISBN / 100000000 == 0) {
            System.out.print("0");
            if (first9OfISBN / 10000000 == 0) {
                System.out.print("0");
                if (first9OfISBN / 1000000 == 0) {
                    System.out.print("0");
                    if (first9OfISBN / 100000 == 0) {
                        System.out.print("0");
                        if (first9OfISBN / 10000 == 0) {
                            System.out.print("0");
                            if (first9OfISBN / 1000 == 0) {
                                System.out.print("0");
                                if (first9OfISBN / 100 == 0) {
                                    System.out.print("0");
                                    if (first9OfISBN / 10 == 0) {
                                        System.out.print("0");
                                        if (first9OfISBN == 0) {
                                            System.out.print("0");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.print(first9OfISBN);
            if (checknum == 10) {
                System.out.println("X");
            } else {
                System.out.println(checknum);
            }
        }
    }
}
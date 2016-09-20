import java.util.Scanner;

/**
 * Created by xiong on 9/20/16.
 */
public class P19 {
    public static String[] insertionSort(String[] name, double[] scores) {
        for (int i = 0; i < scores.length; i++) {
            double currentElement = scores[i];
            String currentName = name[i];
            int k;
            for (k = i - 1; k >= 0 && scores[k] < currentElement; k--) {
                scores[k + 1] = scores[k];
                name[k + 1] = name[k];
            }
            name[k + 1] = currentName;
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = input.nextInt();
        String[] name = new String[number];
        double[] scores = new double[number];
        System.out.println("Enter students' names and scores: ");
        for (int i = 0; i < number; i++) {
            name[i] = input.next();
            scores[i] = input.nextDouble();
        }
        String[] newList = insertionSort(name, scores);
        for (String n : newList) {
            System.out.print(n + " ");
        }
    }
}

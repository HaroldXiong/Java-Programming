import java.io.File;
import java.util.Scanner;

/**
 * Created by xiong on 10/6/16.
 */
public class P29 {
    public static void main(String[] args) {
        System.out.print("Enter a directory: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(getNumberOfFiles(new File(directory)) + " files");
    }

    public static long getNumberOfFiles(File file) {
        long numberOfFiles = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                numberOfFiles += getNumberOfFiles(files[i]);
            }
        } else {
            numberOfFiles++;
        }

        return numberOfFiles;
    }

}

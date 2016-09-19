/**
 * Created by xiong on 9/19/16.
 */
public class P16 {
    public static void main(String[] args) {
        int[] list = new int[100000];
        int key = (int) (Math.random() * 100000);
        long startTime, endTime;
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100000);
        }

        startTime = System.currentTimeMillis();
        linearSearch(list, key);
        endTime = System.currentTimeMillis();
        System.out.println("Linear Search's time: "
                + (endTime - startTime) + "ms");

        int[] newList = insertionSort(list);
        startTime = System.currentTimeMillis();
        binarySearch(newList, key);
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search's time: "
                + (endTime - startTime) + "ms");
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        return list;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}

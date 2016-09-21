/**
 * Created by xiong on 9/21/16.
 */
public class P3 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] correctCounts = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCounts[i]++;
            }
        }
        int[] indexList = new int[answers.length];

        sortAndKeepIndex(correctCounts, indexList);

        for (int i = 0; i < correctCounts.length; i++) {
            System.out.println("Student " + indexList[i] + ": " +
                    correctCounts[i]);
        }
    }

    public static void sortAndKeepIndex(int[] list, int[] indexList) {
        int currentMax;
        int currentMaxIndex;

        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = list.length - 1; i >= 1; i--) {
            currentMax = list[i];
            currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;

                int temp = indexList[i];
                indexList[i] = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = temp;
            }
        }
    }
}

package sortingalgorithms;

/**
 *
 * @author sthapa5
 */
public class InsertionSort {
    /**
     *
     * @param inputList List of numbers to be sorted
     */
    public static void sort(int[] inputList) {
        int len = inputList.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (inputList[j-1] > inputList[j]) {
                    //swap values at inputList[j] and inputList[j-1]
                    int temp = inputList[j];
                    inputList[j] = inputList[j-1];
                    inputList[j-1] = temp;
                }

            }
        }
    }
    
}

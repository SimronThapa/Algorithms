package sortingalgorithms;

/**
 *
 * @author sthapa5
 */
public class BubbleSort {
    /**
     *
     * @param inputList List of numbers to be sorted
     */
    public static void sort(int[] inputList) {
        int len = inputList.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (inputList[j] > inputList[j+1]) {
                    //swap values at inputList[i] and inputList[j+1]
                    int temp = inputList[j];
                    inputList[j] = inputList[j+1];
                    inputList[j+1] = temp;
                }

            }
        }
    }
    
}

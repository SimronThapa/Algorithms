/**
 * Implementing Bubble sort algorithm in JAVA
 * Worst case complexity = O(n^2)
 *
 * @author sithapa
 */
 
 public class BubbleSort {

    /**
     *
     * @param inputList List of numbers to be sorted
     */
    public static void sort(int[] inputList) {
        int len = inputList.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (inputList[i] > inputList[j+1]) {
                    //swap values at inputList[i] and inputList[j+1]
                    int temp = inputList[i];
                    inputList[i] = inputList[j+1];
                    inputList[j+1] = temp;
                }

            }
        }
    }
}

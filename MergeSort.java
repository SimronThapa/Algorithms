package sortingalgorithms;

/**
 *
 * @author sthapa5
 */
public class MergeSort {
    private int[] array;
    private int[] tempArr;
    private int len;
    /**
     *
     * @param inputList List of numbers to be sorted
     */
    public static void sort(int[] inputList) {
        this.array = inputList;
        this.len = inputList.length;
        this.tempArr = new int[len];
        executeMergeSort(0, length - 1);
    }
     /**
     * Breaks the problem into smaller parts, and recursively calls itself for
     * the smaller parts. 
     * If the size of the input list is 1, it is obviously already sorted.
     * @param low The lowest index of the sub-array
     * @param high The highest index of the sub-array
     *
     */
    private void executeMergeSort(int low, int high) {
         
        if (low < high) {
            int mid = low + (high - low) / 2;
            // Below step sorts the left side of the array
            executeMergeSort(low, mid);
            // Below step sorts the right side of the array
            executeMergeSort(mid + 1, high);
            // Now merge both sides
            merge(low, mid, high);
        }
    }
     /**
     * Merges the two sorted sub-lists. The two sorted sub-lists are inside the same original list, the formal parameter 'list'. 
     * @param low The lowest index of the sub-array
     * @param high The highest index of the sub-array
     * @param mid The middle index which divides the sub-array
     */
    private void merge(int low, int mid, int high) {
 
        for (int i = low; i <= high; i++) {
            tempArr[i] = array[i];
        }
        int i = low;
        int j = mid + 1;
        int currentPosition = low;
        while (i <= mid && j <= high) {
            if (tempArr[i] <= tempArr[j]) {
                array[currentPosition] = tempArr[i];
                i++;
            } else {
                array[currentPosition] = tempArr[j];
                j++;
            }
            currentPosition++;
        }
        while (i <= mid) {
            array[currentPosition] = tempArr[i];
            currentPosition++;
            i++;
        }
 
    }
    
}

package sortingalgorithms;

/**
 *
 * @author sthapa5
 */
public class SelectionSort {
    
    /**
     *
     * @param inputList List of numbers to be sorted
     */
    public static void sort(int[] inputList){
        
        int len = inputList.length;
        //Move the boundary of unsorted list, one at a time
        for (int i = 0; i < len-1; i++){
            //Find the minimum element in unsorted list
            int minIndex = i;
            for(int j = i+1; j < len; j++){
                if(inputList[j]< inputList[minIndex]){
                    minIndex = j;
                }
            }
            //Swap the new minimum element with the previously 
            //set minimum element
            int temp = inputList[minIndex];
            inputList[minIndex] = inputList[i];
            inputList[i] = temp;
            
        }
    }
    
}

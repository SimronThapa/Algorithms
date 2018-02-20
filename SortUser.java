import java.util.Arrays;


/**
*
* @author sithapa
*/
public class SortUser{
      public static void main(String...args){
            int[] inputList = {23,56,12,9,34,29,14,2,87,45,34,1};
            System.out.println(Arrays.toString(inputList));
            BubbleSort.sort(inputList);
            System.out.println(Arrays.toString(inputList));
            
        }     
}

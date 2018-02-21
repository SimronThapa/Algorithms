/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortingalgorithms;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sthapa5
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] inputList = {23,56,12,9,34,29,14,2,87,45,34,1};
        System.out.println(Arrays.toString(inputList));
        
        System.out.println("Enter 1 for Bubble Sort, 2 for Selection Sort, 3 for Insertion Sort:");
        Scanner sortType = new Scanner(System.in);
        int n = sortType.nextInt();
      
        switch (n) {
            case 1:
                BubbleSort.sort(inputList);
                break;
            case 2:
                SelectionSort.sort(inputList);
                break;
            case 3:
                InsertionSort.sort(inputList);
                break;
            default:
                System.out.println("Wrong Selection");
                break;
        }
        System.out.println(Arrays.toString(inputList));        
    }  
}

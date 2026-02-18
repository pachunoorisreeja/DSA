package DSAConcepts.Arrays.BasicProblems.Operations.Insertions;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtBeginingUsingCustomMethod {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,0};
       int n = arr.length;
       for (int i=n-2;i>=0;i--) {
           arr[i + 1] = arr[i];
       }
       arr[0]=111;
        System.out.println("\nArray after insertion");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
/* Time Complexity: O(n), where n is the size of the array. */

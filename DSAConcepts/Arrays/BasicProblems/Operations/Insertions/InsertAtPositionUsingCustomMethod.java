package DSAConcepts.Arrays.BasicProblems.Operations.Insertions;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtPositionUsingCustomMethod {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,0};
       int pos = 2;
       for(int i=arr.length-1;i>pos;i--){
           arr[i] = arr[i-1];
       }
       arr[pos]=333;
       for (int n: arr){
           System.out.println(n+" ");
       }
    }
}
/* Time Complexity: O(n), where n is the size of the array. */

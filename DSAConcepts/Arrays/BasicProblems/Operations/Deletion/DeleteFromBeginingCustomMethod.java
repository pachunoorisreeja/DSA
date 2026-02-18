package DSAConcepts.Arrays.BasicProblems.Operations.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFromBeginingCustomMethod {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));
    }

}
/* Time Complexity: O(n)
Auxiliary Space: O(1)*/

package DSAConcepts.Arrays.BasicProblems.Operations.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFromGivenPositionCustomMethod {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        int pos =3;
       // System.out.println("\nArray after Deletion");
        for (int i = pos; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));

    }

}
/* Time Complexity: O(n)
Auxiliary Space: O(1)*/

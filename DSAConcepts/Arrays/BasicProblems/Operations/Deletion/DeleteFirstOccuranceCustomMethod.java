package DSAConcepts.Arrays.BasicProblems.Operations.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFirstOccuranceCustomMethod {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,5,6,7,8,3,9,10};
        int value =3;
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            if (flag){
                arr[i-1]=arr[i];
            } else if(arr[i]==value){
                flag = true;
            }
        }
    arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));}
}

package DSAConcepts.Arrays.GeekForGeekTop50Problems.Easy;

import java.util.Arrays;

public class SecondLargest_Native {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println("second Largest Element "+getSecondLargest(arr));

    }
    public static int getSecondLargest(int[] arr){
        Arrays.sort(arr);
        int len = arr.length;
        for (int i=len-2;i>=0;i++){
            if (arr[i]!=arr[len-1]){
                return arr[i];
            }
        }
        return -1;

    }
}

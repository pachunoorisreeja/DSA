package DSAConcepts.Arrays.GeekForGeekTop50Problems.Easy;

import java.util.Arrays;

public class ThirdLargestElementSortMethod {
    public static void main(String[] args) {
        System.out.println(thidLargest(new int[]{1,2,8,10,90,34}));
    }
    public static int thidLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-3];
    }
}

// time O(n logn) and O(1) space
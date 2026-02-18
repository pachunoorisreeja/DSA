package DSAConcepts.Arrays.SlidingWindow;

import java.util.Arrays;
import java.util.Map;

public class SlidingWithFixedSize {
    public static void main(String[] args) {
        System.out.println(" Maximum Sum Subarray of Size K "+maximum_Sum_Subarray_of_Size_k(new int[]{2,1,5,1,3,2},3));
        System.out.println(" Min Sum Subarray of Size K "+minimum_Sum_Subarray_of_Size_k(new int[]{2,1,5,1,3,2},3));
        System.out.println(" Average of All Subarrays of Size K "+ Arrays.toString(average_of_All_Subarrays_of_Size_k(new int[]{1,3,2,6,-1,4,1,8,2},5)));
        System.out.println("Count Subarrays of Size K With Sum > X  "+count_Subarrays_of_Size_K_With_Sum_GreaterThan_x(new int[]{1,4,2,10,2,3,1,0,20}, 4, 18));
       // System.out.println("First Negative Number in Every Window of Size K   "+first_Negative_Number_in_Every_Window_of_Size_K(new int[]{12,-1,-7,8,-15,30,16,28}, 3));



    }
    // Maximum Sum Subarray of Size K
    public static int maximum_Sum_Subarray_of_Size_k(int arr[], int k){
        if (arr == null || arr.length == 0 || k> arr.length || k< 0){
            throw new IllegalArgumentException("Array is null or empty or k is ouside the array size");
        }

        int sum =0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max = sum;
        for (int i=k;i<arr.length;i++){ // 3
            sum+=arr[i];
            sum-=arr[i-k];
            max = Math.max(sum,max);

        }
            return max;
    }
    // Minimum Sum Subarray of Size K
    public static int minimum_Sum_Subarray_of_Size_k(int arr[], int k){
        if (arr == null || arr.length == 0 || k>arr.length || k <0){
            throw new IllegalArgumentException("Array is null or empty or k is outside array length or k is negative");
        }
        int sum =0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int min = sum;
        for (int i=k;i<arr.length;i++){ // 3
            sum+=arr[i];
            sum-=arr[i-k];
            min = Math.min(sum,min);

        }
        return min;
    }
    // Average of All Subarrays of Size K
    public static float[] average_of_All_Subarrays_of_Size_k(int arr[], int k){
        if (arr == null || arr.length == 0 || k<= 0 || k > arr.length){
            throw new IllegalArgumentException("Array is null or empty or k is invalid");
        }
        float sum =0;
        float result[] = new float[k];
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        float avg = sum/k;
        int count=0;
        result[count++]= avg;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            result[count++]=(sum/k);

        }
return result;
    }
    // Count Subarrays of Size K With Sum > X input: arr=[1,4,2,10,2,3,1,0,20], k=4, x=18
    public static int count_Subarrays_of_Size_K_With_Sum_GreaterThan_x(int arr[], int k, int x){
        if (arr == null || arr.length == 0 || k<=0 || k>arr.length){
            throw new IllegalArgumentException("Array is null or empty or k is invalid");
        }
        int sum =0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        int count =0;
        if (sum>x){
            count++;
        }
        for (int i=k;i<arr.length;i++){
            sum +=arr[i];
            sum-=arr[i-k];
            if (sum>x){
                count++;
            }
        }
        return count;
    }
    // First Negative Number in Every Window of Size K input arr=[12,-1,-7,8,-15,30,16,28], k=3
    //Output: [-1,-1,-7,-15,-15]
   /* public static int first_Negative_Number_in_Every_Window_of_Size_K(int arr[], int k) {
    }*/
}

package DSAConcepts.Arrays.BasicProblems.EasyProblems;

import java.util.Arrays;
// 🔷 Practice Tasks for Week 1 Arrays
public class EasyProblems {
    public static void main(String[] args) {
       // int a[] = {1,2,3};
        //printSubarrays(a);
        /*int arr[] = {1,2,3,4,5};
        System.out.println(sumOfArray(arr));
        System.out.println(countEven(arr));
        System.out.println(maxElement(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(checkPalindrome(new int[]{1,2,3,2,1}));*/
        //System.out.println(pairSum(new int[]{1,2,3,4,6},6));
        //System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));
        System.out.println(Arrays.toString(shiftArrayByOneElement(new int[]{1,2,3,4,5}))    );


    }
    public static int sumOfArray(int arr[]){
        if (arr == null || arr.length==0 ){
            throw new IllegalArgumentException("Array is empty or null");
        }
        int sum =0;
        for (int i: arr){
            sum+=i;
        }
    return sum;}
    public static int countEven(int arr[]){
        if (arr == null || arr.length==0 ){
            throw new IllegalArgumentException("Array is empty or null");
        }
        int count =0;
        for (int i: arr){
            if ((i&1) == 0){
                count++;
            }
        }
        return count;
    }
    public static int maxElement(int arr[]){
        if (arr == null || arr.length==0)
            throw new IllegalArgumentException("Array is null or empty");
        int max =Integer. MIN_VALUE;
        for (int i: arr){
           if(i> max)
               max = i;
        }
    return max;}
    public static int[] reverseAnArray(int[] arr){
        if (arr == null || arr.length==0)
            throw new IllegalArgumentException("Array is null or empty");
        int left =0, right = arr.length-1;
        while (left < right){
            int temp=  arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;

        }
    return arr;}
    public static boolean checkPalindrome(int arr[]){
        if (arr == null || arr.length==0)
            throw new IllegalArgumentException("Array is null or empty");
        int left =0, right = arr.length-1;
        while (left <right){
            if (arr[left]!=arr[right]){
                return  false;
            }
            left++;
            right--;
        }
    return true;}
    // brute forcce method
    public static void printSubarrays(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array is null");

        int n = arr.length;

        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
    // brute forcce method
    public static boolean pairSum(int arr[], int target){
        int left = 0, right = arr.length-1;
        int sum =0;
        while (left<right){
            sum = arr[left]+arr[right];
            if (sum == target){
                return true;
            }
            else if (sum< target){
                left++;
            }
            else {
                right--;
            }
        }
    return false;}
    // brute force approach
    public static int[] copyArray(int arr[]){
        int copyArray[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            copyArray[i] = arr[i];
        }
        return copyArray;
    }
    // brute force
    public static int[] shiftArrayByOneElement(int arr[]){
        int temp = arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0] = temp;
        return arr;
    }

}

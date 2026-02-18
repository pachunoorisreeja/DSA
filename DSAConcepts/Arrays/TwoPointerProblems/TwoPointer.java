package DSAConcepts.Arrays.TwoPointerProblems;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseAnArray(new int[]{1,2,3,4,5})));
        System.out.println(checkPalindrome(new int[]{1,2,3,2,1}));
        System.out.println(Arrays.toString(pairSum(new int[]{1,2,3,4,6}, 6)));
        System.out.println("No of unique elements "+removeDuplicatesfromSortedArray(new int[]{1,1,2,2,3}));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{1,2,0,0,6})));
       // System.out.println(Arrays.toString(squaresOfSortedArray(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("Two sumII");
        System.out.println(Arrays.toString(twoSumII(new int[]{2,7,11,15}, 9)));
        System.out.println("removeElement "+removeElement(new int[]{3,2,2,3},3));

    }
    public static int[] reverseAnArray(int arr[]){
        if (arr == null || arr.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int left =0, right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        return arr;
    }
    public static boolean checkPalindrome(int arr[]){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is null or empty");
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            if (arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;}
    public static int[] pairSum(int arr[], int target){
        if (arr == null || arr.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int left =0, right =arr.length-1, sum=0;
        while (left<right){
            sum = arr[left]+arr[right];
            if (sum==target){
                return new int[]{left, right};
            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    public static int removeDuplicatesfromSortedArray(int arr[]){
        if (arr == null || arr.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int slow =1;
        for (int fast =1;fast<arr.length;fast++){
            if (arr[fast]!=arr[fast-1]){
                arr[slow]= arr[fast]; // {1,1,2,2,3}
                slow++;
            }

        }
        for (int i=0;i<slow;i++){
            System.out.println(arr[i]+" ");
        }
    return slow;}
    public static int[] moveZerosToEnd(int arr[]){
        if (arr == null || arr.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int slow =0;
        for (int fast =0;fast<arr.length;fast++ ){ // {1,0,2,9,0,23,0}
            if (arr[fast]!=0){ // 0, 2, 3,5,
                arr[slow] = arr[fast]; // 0 =0; 1="2",2  {1,2,9,23 }
                slow++; // 1,
            }

        }
        while (slow<arr.length){
            arr[slow] =0;
            slow++;
        }
    return arr;}
    public static int[] squaresOfSortedArray(int arr[]){
        System.out.println("squaresOfSortedArray");
        int index = arr.length-1, left =0, right = arr.length-1;
        int result[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){ // -4, -1, 0, 3, 10 // 16,1,0,9,100
            while (left<=right) {
            int leftsquare =  arr[left]*arr[left];
                int rightsquare =  arr[right]*arr[right];
                if (arr[leftsquare]>arr[rightsquare]){
                    result[index] = arr[leftsquare];
                    left++;
                }
                else {
                    result[index] = arr[rightsquare];
                    right--;
                }
                index--;

            }

        }
   return arr; }
    public static int[] twoSumII(int arr[], int target){
        int left =0, right = arr.length-1;
        while (left < right){
            int sum = arr[left]+arr[right];
            if (sum == target){
                return new int[]{left++, right++};
            }
            else if(sum <target){
                left++;
            } else{
                right --;


            }
        }
    return new int[]{-1, -1};
    }
    public static int removeElement(int arr[], int value){
        int slow=0;
        for (int fast =0; fast<arr.length;fast++){
            if (arr[fast]!=0){
                arr[slow]=arr[fast];
                slow++;
            }

        }
       return slow;
    }
}

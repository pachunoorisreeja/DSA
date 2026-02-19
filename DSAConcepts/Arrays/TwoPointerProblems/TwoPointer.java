package DSAConcepts.Arrays.TwoPointerProblems;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseAnCharArray(new char[]{'h','e','l','l','o'})));
        System.out.println(Arrays.toString(reverseAnArray(new int[]{1,2,3,4,5})));
        System.out.println("validPlaindrome "+validPlaindrome("madam"));
        System.out.println(checkPalindrome(new int[]{1,2,3,2,1}));
        System.out.println(Arrays.toString(pairSum(new int[]{1,2,3,4,6}, 6)));
        System.out.println("No of unique elements "+removeDuplicatesfromSortedArray(new int[]{1,1,2,2,3}));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{1,2,0,0,6})));
       // System.out.println(Arrays.toString(squaresOfSortedArray(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("Two sumII");
        System.out.println(Arrays.toString(twoSumII(new int[]{2,7,11,15}, 9)));
        System.out.println("removeElement "+removeElement(new int[]{3,2,2,3},3));
        System.out.println("squaresOfSortedArray "+Arrays.toString(test(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("containerWithMostWater "+containerWithMostWater(new int[]{1,8,6,2,5,4,8,3,7}));

    }

    // [Two Pointer - Opposite Direction] EASY: 1️⃣ Reverse String
    public static char[] reverseAnCharArray(char c[]){
        if (c == null || c.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int left =0, right = c.length-1;
        while (left<right){
            char ch = c[left];
            c[left] =c[right];
            c[right] = ch;
            left++;
            right--;
        }
        return c;
    }

    // [Two Pointer - Opposite Direction] EASY: 1️⃣ Reverse Array
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

    // [Two Pointer - Opposite Direction] EASY: 2️⃣ Valid Palindrome
    public static boolean validPlaindrome(String s){
        if (s == null || s.length() == 0)
            throw new IllegalArgumentException("Array is null or empty");
        int left =0, right = s.length()-1;
        char c[] = s.toCharArray();
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
                    }
            left++;
            right--;
        }
        return true;
    }

    // [Two Pointer - Opposite Direction] EASY: 2️⃣ Valid Palindrome
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

    // [Two Pointer - Opposite Direction] EASY: 4️⃣ Squares of Sorted Array
    public static int[] squaresOfSortedArray(int arr[]){
        System.out.println("squaresOfSortedArray");
        int index = arr.length-1, left =0, right = arr.length-1;
        int result[] = new int[arr.length];
        // -4, -1, 0, 3, 10 // 16,1,0,9,100
            while (left<=right) {
            int leftsquare =  arr[left]*arr[left];
                int rightsquare =  arr[right]*arr[right];
                if (leftsquare>rightsquare){
                    result[index] = leftsquare;
                    left++;
                }
                else {
                    result[index] = rightsquare;
                    right--;
                }
                index--;
        }
   return result; }

    // [Two Pointer - Opposite Direction] EASY: 3️⃣ Two Sum II (Sorted Array)
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

    // [Two Pointer - Opposite Direction]  MEDIUM 5️⃣ Container With Most Water , input: 1,8,6,2,5,4,8,3,7
    public static int containerWithMostWater(int arr[]){
        int left=0, right = arr.length-1;
        int maxArea=0, max=0;
        while (left<right){
            maxArea = Math.min(arr[left], arr[right])*(right-left);
            max = Math.max(max, maxArea) ;
            if (arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }

        }
        return max;
    }

    public static int[] test(int arr[]){
        //int arr[]={-4, -1, 0, 3, 10};
        int result[] = new int[arr.length];
        int index =  arr.length-1;
        int left =0, right = arr.length-1;
        while (left<=right){
            int leftSquare =  arr[left]*arr[left];
            int rightSuare =  arr[right]*arr[right];
            if (leftSquare>rightSuare){
                result[index] = leftSquare;
                left++;
            }else{
                result[index] = rightSuare;
                right--;
            }
            index--;
        }

    return result;}
}


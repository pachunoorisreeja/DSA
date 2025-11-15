package DSA.Patterns.Arrays.Level2;

import javax.sound.midi.Soundbank;

//
public class Pattern1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //✅ Example 1: Reverse an array in place
        reverseAnArrayInPlace(arr);
        int[] arr1 = {1, 2, 3, 2, 1};
        checkArrayIsPalindrome(arr1);
        int[] arr2 = {1, 2, 3, 4, 6};
        int target = 6;
        twoSumTargetSorted(arr2, target);

    }
    public static void reverseAnArrayInPlace(int[] arr) {
    int left =0, right = arr.length-1;
    while (left<right){
        int temp =arr[left];
        arr[left] =arr[right];
        arr[right]= temp;
        left++;
        right--;
    }
    for (int i: arr){
        System.out.println(i);
    }
    }

    public static void checkArrayIsPalindrome(int[] arr) {
        boolean flag = true;
        int left =0, right = arr.length-1;
        while (left<right){
            if(arr[left] != arr[right]){
                flag = false;
                break;
            }
            left++;
            right--;
        }
       if (flag){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not a Palindrome");
       }
    }
    public static void twoSumTargetSorted(int[] arr, int target) {
int left=0, right = arr.length-1;
while (left<right){
    int sum = arr[left]+arr[right];
    if (sum == target){
        System.out.println("Sum of "+arr[left]+" "+arr[right]+" is "+target);
        break;
    }
    else if(sum < target){
        left++;
    }else{
        right --;
    }
}

    }

    }

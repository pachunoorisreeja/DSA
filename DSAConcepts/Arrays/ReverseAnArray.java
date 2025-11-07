package DSAConcepts.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]  = reverseArray(new int[]{1,2,3,44,23,11,78});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] reverseArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            arr[left] +=arr[right]; // int temp = arr[left];
            arr[right] = arr[left]-arr[right]; // arr[left] = arr[right];
            arr[left]-=arr[right]; // arr[right] = temp;
            left++;
            right--;
        }
        return arr;

    }
}

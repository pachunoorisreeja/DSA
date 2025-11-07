package DSAConcepts.Arrays;

public class RotateElelemntRightBy3Steps {
    public static void main(String[] args) {
        int arr[] = rotateArrayRightByKSteps(new int[]{1,2,3,4,5,6}, 3);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
    public static void rotate(int arr[], int start, int last){
        while (start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }


    }
    public static int[] rotateArrayRightByKSteps(int arr[], int k){

        rotate(arr, 0, arr.length-1-k);
        rotate(arr, arr.length-k, arr.length-1);
        rotate(arr,0, arr.length-1);

return arr;

    }
}

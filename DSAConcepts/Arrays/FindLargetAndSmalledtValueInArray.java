package DSAConcepts.Arrays;

public class FindLargetAndSmalledtValueInArray {
    public static void main(String[] args) {
        int arr[]  = findMinAndMaxInArray(new int[]{1,2,3,44,23,11,78});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] findMinAndMaxInArray(int arr[]){
        int a[] = new int[2];
        int min =arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
            else if(arr[i]>max){
                max =arr[i];
            }
        }
        a[0] = min;
        a[1] = max;
        return a;

    }
}

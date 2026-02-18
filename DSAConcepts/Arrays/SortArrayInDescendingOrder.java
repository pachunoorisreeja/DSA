package DSAConcepts.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        sortUsingSortMethod(arr);
        Integer[] array = {5, 2, 9, 1, 3};
        sortUsingReverseOrderMethod(array);
        sortUsingStreams(arr);
        reverseInPlace(arr);
        // selection sort
        reverseUsingSelectionSort(arr);
    }
    // method 1:
    public static void sortUsingSortMethod(int arr[]){
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sortUsingReverseOrderMethod(Integer arr[]){
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void sortUsingStreams(int arr[]){
        int a[] = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(a));
    }
    public static void reverseInPlace(int arr[]){
        Arrays.sort(arr);
        int i=0, j= arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseUsingSelectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
}

/*
📌 Interview Tip (Important)
| Scenario             | Best Method                  |
| -------------------- | ---------------------------- |
| `int[]` only         | `Arrays.sort + reverse loop` |
| Allowed `Integer[]`  | `Collections.reverseOrder()` |
| Java 8+              | Streams                      |
| In-place requirement | Manual reverse               |
 */
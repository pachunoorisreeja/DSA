package DSAConcepts.Arrays.GeekForGeekTop50Problems.Easy;

public class SecondLargest_Efficient {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println("second Largest Element "+getSecondLargest(arr));

    }
    public static int getSecondLargest(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]> firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if(arr[i]> secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
    return  secondLargest;}
}
/* Time Complexity: O(2*n) = O(n), as we are traversing the array two times.
Auxiliary space: O(1), as no extra space is required. */

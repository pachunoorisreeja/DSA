package DSAConcepts.Arrays.BasicProblems.Operations.Traversal;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int low =0, high = arr.length-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid]==target){
                System.out.println("Found at "+mid);
                return;
            } else if(target <arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
    }
}

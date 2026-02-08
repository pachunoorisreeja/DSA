package DSAConcepts.Arrays.BasicProblems.Operations;

public class Reverse_Traversal {
    public static void main(String[] args) {
    int[] arr ={1,2,45,7,89,90,100};
    int n = arr.length;
    System.out.print("Reverse Traversal: ");
    for (int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    }
}
/*
Time Complexity: O(n)
Auxiliary Space: O(1)
 */

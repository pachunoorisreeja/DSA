package DSAConcepts.Arrays.BasicProblems.Operations.Traversal;

public class TraversalUsingForEach {
    public static void main(String[] args) {
        int arr[]={1,23,56,78,89,100};
        System.out.print("Traversal using while loop: ");
        for(int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
Time Complexity: O(n)
Auxiliary Space: O(1)
 */
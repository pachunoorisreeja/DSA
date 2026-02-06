package DSAConcepts.Arrays.BasicProblems.Operations;

public class SearchingAnElement {
    public static void main(String[] args) {
    int[] arr ={1,2,45,7,89,10,100};
    int n = arr.length;
    int target =10;
    System.out.print("Searching an Element: ");
    for(int i:arr){
        if (i==target){
            System.out.println("Found");
            break;
        }
    }

    }
}
/*
Time Complexity: O(n)
Auxiliary Space: O(1)
 */

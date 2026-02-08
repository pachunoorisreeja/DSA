package DSAConcepts.Arrays.BasicProblems.Operations;

public class TraversalUsingWhileLoop {
    public static void main(String[] args) {
        int arr[]={1,23,56,78,89,100};
        int len = arr.length;
        int i=0;
        while (i<len){
            System.out.print(arr[i]);
            i++;
        }
        System.out.println();
    }
}

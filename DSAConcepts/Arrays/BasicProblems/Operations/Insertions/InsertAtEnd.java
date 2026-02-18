package DSAConcepts.Arrays.BasicProblems.Operations.Insertions;

public class InsertAtEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,0};
            arr[arr.length-1]= 333;
            for (int i:arr){
                System.out.println(i+" ");
            }
    }
}
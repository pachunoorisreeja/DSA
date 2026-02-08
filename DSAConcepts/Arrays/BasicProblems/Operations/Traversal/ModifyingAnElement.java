package DSAConcepts.Arrays.BasicProblems.Operations;

public class ModifyingAnElement {
    public static void main(String[] args) {
    int[] arr ={1,2,45,7,89,10,100};
    int n = arr.length;
    System.out.print("Modifying an Element: ");
   for (int i=0;i<arr.length;i++){
       arr[i] =arr[i]+5;
   }
   for (int i:arr){
       System.out.print(i+" ");
   }
        System.out.println( );

    }
}
/*
Time Complexity: O(n)
Auxiliary Space: O(1)
 */

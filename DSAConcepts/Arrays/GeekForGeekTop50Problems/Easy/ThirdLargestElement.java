package DSAConcepts.Arrays.GeekForGeekTop50Problems.Easy;

public class ThirdLargestElement {
    public static void main(String[] args) {
        System.out.println(thidLargest(new int[]{1,2,8,10,90,34}));
    }
    public static int thidLargest(int[] arr){
        int firstLargest = Integer.MIN_VALUE;
        for (int i:arr){
            if (i>firstLargest){
                firstLargest =i;
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i:arr){
            if (i>secondLargest && i<firstLargest){
                secondLargest =i;
            }
        }
        int thirdLargest = Integer.MIN_VALUE;
        for (int i:arr){
            if (i>thirdLargest && i< secondLargest){
                thirdLargest =i;
            }
        }
    return thirdLargest;}
}
//  O(n) time and O(1) space
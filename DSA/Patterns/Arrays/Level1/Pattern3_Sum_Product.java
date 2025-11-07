package DSA.Patterns.Arrays.Level1;

public class Pattern3_Sum_Product {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11};
        SumOfElements(arr);
        avgOfArrayElements(arr);
        productOfAllNumberInArray(arr);
        evenOddIndexedSum(arr);
        eveOddSumDiff(arr);
    }
    public static void SumOfElements(int arr[]){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("Sum of Elements: "+sum);
    }
    public static  void avgOfArrayElements(int arr[]){
        double avg =0.0;
        for(int i:arr){
            avg+=i;
        }
        System.out.println("Average of Array Elements :"+avg/arr.length);
    }
    public static  void productOfAllNumberInArray(int arr[]){
        long product =1;
        for(int i:arr){
            product*=i;
        }
        System.out.println("Product of Array Elements :"+product);
    }
public static void evenOddIndexedSum(int[] arr){
        int evenIndexedSum = 0;
        int oddIndexedSum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenIndexedSum+=arr[i];
            }else{
                oddIndexedSum+=arr[i];

            }
        }
    System.out.println("EvenIndexed Sum: "+evenIndexedSum+" Odd IndexedSum: "+oddIndexedSum);
}
    public static void eveOddSumDiff(int arr[]){
        int evenSum=0, oddSum=0;
        for(int i:arr){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("Diff of evenSum and oddSum is: "+Math.abs(evenSum-oddSum));
    }
}



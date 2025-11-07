package DSA.Patterns.Arrays.Level1;

public class Patterns1_Traversal {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,1};
        traversingArray(arr);
        sumOfAllElement(arr);
        evenAndOddCount(arr);
        countNumbersGreaterThanGivenValue(arr);
        countPostiveNegativeZeros(arr);
    }
    // 1. Print elements of an array
    public static void traversingArray(int[] arr){
        System.out.println("Elements Are: ");
        for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i] + " ");
        }
    }
    // 2.Find the sum of all elements
    public static void sumOfAllElement(int arr[]){
        System.out.println("Sum of all elements Are: ");
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        System.out.println(sum);

    }
    //3. Count even and odd numbers
    public static void evenAndOddCount(int arr[]){
        int evenCount =0, oddCount =0;
        for(int i:arr){
            if(i%2==0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Count "+evenCount+" Odd Count "+oddCount);
    }
    //4. Count numbers > given value
    public static void countNumbersGreaterThanGivenValue(int arr[]){
        int count=0;
        for(int i:arr){
            if(i>12){
                count++;
            }
        }
        System.out.println("countNumbersGreaterThanGivenValue "+count);
    }
    public static void countPostiveNegativeZeros(int arr[]){
        int positive =0, negative=0, zeros=0;
        for(int i:arr){
            if(i>0){
                positive++;
            }else if(i<0){
                negative++;
            }else {
                zeros++;
            }
        }
        System.out.println("Postive: "+positive+" Negative: "+negative+" Zeros: "+zeros);}
}

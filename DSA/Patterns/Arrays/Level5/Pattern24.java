package DSA.Patterns.Arrays.Level5;

public class Pattern24 {
    public static void main(String[] args) {
       findMissingNumber(new int[]{3,0,1});
        findMissingNumberUsingXor(new int[]{3,0,1});
       findSingleNumber(new int[]{1,2,5,5,2});
       // 2. 231. Power of Two problem
        powerOfTwo(23);

    }
    public static void findMissingNumber(int arr[]){
        int expectedSum = arr.length*(arr.length+1)/2;
        int actualSum =0;
        for (int i:arr){
            actualSum+=i;
        }

        System.out.println("Missing Number is "+(expectedSum-actualSum));
    }

    public static void findMissingNumberUsingXor(int arr[]){
        int xor =0;
        for (int i: arr){
            xor^=i;
        }
        for (int i=1;i<=arr.length;i++){
            xor^=i;
        }
        System.out.println("Missing Number is "+xor);
    }
    public static void findSingleNumber(int arr[]){
        if (arr == null || arr.length==0){
            System.out.println("Array is null or array is empty");
        }
        int xor=0;
        for (int i:arr){
            xor^=i;
        }
        System.out.println("Single Number "+xor);
    }
    public static void powerOfTwo(int n){
        if (n<1){
            System.out.println("Invalid");
        }
        System.out.println((n & (n-1))==0?"Power of two":"Not power of two");
    }
}

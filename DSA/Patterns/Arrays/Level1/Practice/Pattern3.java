package DSA.Patterns.Arrays.Level1.Practice;
//⭐ Pattern 3: Sum / Product – 10 Questions
public class Pattern3 {
    public static void main(String[] args) {
        //int arr[] ={1,2,3,4,5,6,7,1,2,12,13,24,34};
        // 21. Find the average of all numbers.
        averageOfAllElement(new int[]{1,2,3,4,5});
        // 22. Find the sum of only even numbers.
        sumOfOnlyEvenElements(new int[]{1,2,3,4,5});
        // 23. Find the sum of only odd numbers.
        sumOfOnlyOddElements(new int[]{1,2,3,4,5});
        // 24. Find the product of all elements.
        productOfAllElements(new int[]{1,2,3,4,5});
        // 25. Find the product of only positive elements.
        productOfPositiveElements(new int[]{1,2,3,4,5});
        // 26. Find the difference between sum of even-indexed and odd-indexed elements.
        diffSumofEvenIndexOddIndexedElements(new int[]{1,2,3,4,5});
        // 27. Count pairs whose sum is even.
        countThePairsWhoseSumIsEven(new int[]{1,2,3,4,5});
        // 28. Count pairs whose sum is odd.
        countThePairsWhoseSumIsOdd(new int[]{1,2,3,4,5});
        // 29. Compute prefix sums (store in new array).
        computePrefixSum(new int[]{1,2,3,4,5});
        // 30. Compute suffix sums (store in new array).
        computeSuffixSum(new int[]{1,2,3,4,5});
    }
    public static void averageOfAllElement(int arr[]){
        double avg =0.0d;
        for (int i: arr){
            avg+=i;
        }
        System.out.println("Average of arr elements is "+avg/arr.length);
    }
    public static void sumOfOnlyEvenElements(int arr[]) {
        int evenSUm = 0;
        for (int i: arr){
            if(i%2==0){
                evenSUm+=i;
            }
        }
        System.out.println("Even sum :"+evenSUm);

    }
    public static void sumOfOnlyOddElements(int arr[]) {
        int oddSum =0;
        for (int i: arr){
            if(i%2!=0){
            oddSum+=i;
            }
        }
        System.out.println("Odd Sum: "+oddSum);
        }
    public static void productOfAllElements(int arr[]) {
        long productOfAll = 1;
        for (int i: arr){
            productOfAll*=i;
        }
        System.out.println("Product of all "+productOfAll);

    }
    public static void productOfPositiveElements(int arr[]) {
        long product = 1;

        for (int i : arr) {
            if (i > 0) {
                product *= i;
            }

        }
        System.out.println("Product of +ve Numbers "+product);
    }
    public static void diffSumofEvenIndexOddIndexedElements(int arr[]) {
        int evenIndexedSum =0, oddIndexedSum = 0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                evenIndexedSum+=arr[i];
            }else{
                oddIndexedSum+=arr[i];
            }
        }
        System.out.println("Diff of even and odd indexed sum "+(Math.abs(evenIndexedSum-oddIndexedSum)));

    }
    public static void countThePairsWhoseSumIsEven(int arr[]) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]+arr[j])%2==0){
                    count++;
                }
            }
        }
        System.out.println("Even Sum Count "+count);

    }
    public static void countThePairsWhoseSumIsOdd(int arr[]) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]+arr[j])%2!=0){
                    count++;
                }
            }
        }
        System.out.println("Odd sum Count "+count);
    }
    public static void computePrefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i] =sum;
        }
        System.out.println("Prefix Array is ");
        for (int k:prefix){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    public static void computeSuffixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum+=arr[i];
            prefix[i] =sum;
        }
        System.out.println("Suffix Array is ");
        for (int k:prefix){
            System.out.print(k+" ");
        }
        System.out.println();
    }

    }

package DSA.Patterns.Arrays.Level1.Practice;
//⭐ Pattern 1: Traversal (Basic Looping) – 12 Questions

public class Pattern1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,-2,3,-1,0,1,-2,-4,0,9,0};
        System.out.println("Given array: "+"{1,2,-2,3,-1,0,1,-2,-4,0,9,0}");
        // 1. Print all positive elements in the array.
        System.out.println("Print All Positive Numbers ");
        printAllPostiveNumbersInArrays(arr);
        // 2. Print all negative elements in the array.
        System.out.println("Print All Negative Numbers");
        printAllNegavtiveNumbersInArrays(arr);
        // 3. Print array elements at even indices.
        System.out.println("Print Elements at Even Indices");
        printAllElementsAtEvenIndicesInArrays(arr);
        // 4. Print array elements at odd indices.
        System.out.println("Elements at Odd Indices");
        printAllElementsAtOddIndicesInArrays(arr);
        // 5. Find the number of elements divisible by 3.
        System.out.println("Total number of Elements divisible by 3");
        countTheNumberOfElementsDivisibleByThree(arr);
        // 6. Count numbers greater than a given X.
        System.out.println("Count the number of Elements Greated than 3");
        countTheNumberOfElementsGreaterThanX(arr, 3);
        // 7. Count numbers smaller than a given X.
        System.out.println("Count the number of Elements smaller than guven Number");
        countTheNumberOfElementsSmallerThanX(arr, 2);
        // 8. Find the index of the first occurrence of a number.
        System.out.println("Index of first occurance of given Number");
        findIndexOfFirstOccuranceOfNumber(arr,1);
        // 9. Find the index of the last occurrence of a number.
        System.out.println("Index of Last Occurance of a number");
        findIndexOfLastOccuranceOfNumber(arr, -2);
        // 10. Print array elements in pairs (arr[i], arr[i+1]).
        System.out.println("Print pairs like arr[i], arr[i+1]");
        printArrayInParOfTwoSideBySide(arr);
        // 11. Print all elements except the first and last.
        System.out.println("Print elements except first and last");
        printElementsExceptFirstAndLast(arr);
        // 12. Find the total number of zeros in the array.
        System.out.println("total numbers of zeros");
        printTotalNumberOfZeros(arr);

    }
    public static void printAllPostiveNumbersInArrays(int arr[]){
        for (int i: arr){
            if(i>0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void printAllNegavtiveNumbersInArrays(int arr[]){
        for (int i: arr){
            if(i<0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void printAllElementsAtEvenIndicesInArrays(int arr[]){
        int count = 0;
        System.out.println("Elements at even indices: ");
        for (int i: arr){
            if(count++%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printAllElementsAtOddIndicesInArrays(int arr[]) {
        int count = 0;
        System.out.println("Elements at Odd indices: ");
        for (int i: arr){
            if(count++%2!=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    public static void countTheNumberOfElementsDivisibleByThree(int arr[]) {
        int count =0;
        for (int i: arr){
            if(i%3 == 0){
                count++;
            }
        }
        System.out.println("Number of Elements Divisible by three is: "+count);
    }
    public static void countTheNumberOfElementsGreaterThanX(int arr[], int x) {
        int count = 0;
        for (int i : arr) {
            if (i > x) {
                count++;
            }
        }

        System.out.println("Number of Elements Greater Than "+x+" is "+count);
        }
    public static void countTheNumberOfElementsSmallerThanX(int arr[], int x) {
    int count =0;
    for(int i: arr){
        if(i<x){
            count++;
        }
    }
        System.out.println("Number of Elements Less Than "+x+" is "+count);
    }
    public static void findIndexOfFirstOccuranceOfNumber(int arr[], int x){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Index of First Ocurrance Of Given Number "+x+" is "+i);
                break;
            }
        }
    }
    public static void findIndexOfLastOccuranceOfNumber(int arr[], int x) {
    for (int i=arr.length-1;i>=0;i--){
        if (arr[i]==x){
            System.out.println("Index of Last Ocurrance Of Given Number "+x+" is "+i);
            break;
        }
    }
    }
    public static void printArrayInParOfTwoSideBySide(int arr[]) {
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+", "+arr[i+1]);
        }
        System.out.println();

        }
    public static void printElementsExceptFirstAndLast(int arr[]) {
        for (int i=1;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            }
    public static void printTotalNumberOfZeros(int arr[]){
        int count=0;
        for (int i: arr){
            if (i==0) {
                count++;
            }
        }
        System.out.println("count "+count);
    }

    }

package DSA.Patterns.Arrays.Level1.Practice;
//🎁 BONUS — 10 Mini Coding Challenges
/*
Print the array but replace negatives with 0.
Print the array but replace even numbers with 1.
Replace all zeros with -1.
Shift all zeros to the end (Level-1 version — using extra array).
Shift all zeros to the front (extra array allowed).
Duplicate a given value K times in output (new array).
Create a new array containing only the prime numbers.
Create a new array containing only squares of elements.
Create a new array that contains the running maximum.
Create a new array that contains the difference arr[i] – arr[i-1].
*/
public class ChallengeProblems {
    public static void main(String[] args) {
        System.out.println("printArrayReplaceNegavtiveWithZero");
        printArrayReplaceNegavtiveWithZero(new int[]{1,2,-2,45,345,35,345,35,});
        System.out.println("printArrayReplaceEvenNoWithOne");
        printArrayReplaceEvenNoWithOne(new int[]{2,3,4,54,6,7,9,5,3,11});
        System.out.println("printArrayReplaceALlZeroWithOne");
        printArrayReplaceALlZeroWithOne(new int[]{3,0,9,0,34,0,5,6,0});
        System.out.println("shiftAllZerosToEnd");
        shiftAllZerosToEnd(new int[]{1,2,3,0,8,0,5,0,5,0});
        System.out.println("shiftAllZerosToFront");
        shiftAllZerosToFront(new int[]{1,0,2,0,3,0,5,7});

    }
    public static void printArrayReplaceNegavtiveWithZero(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                arr[i]=0;
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void printArrayReplaceEvenNoWithOne(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                arr[i]=1;
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void printArrayReplaceALlZeroWithOne(int arr[]){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                arr[i]=1;
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void shiftAllZerosToEnd(int arr[]){
        int result[] = new int[arr.length];
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                result[count++]=arr[i];
            }
        }
        while (count<arr.length){
            result[count++] =0;
        }
        for (int k:result) {
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static void shiftAllZerosToFront(int arr[]) {
        int result[] = new int[arr.length];
        int count=arr.length-1;
        for (int i= arr.length-1;i>=0;i--){ //{1,2,0,3,0,4,5};
            if (arr[i]!=0){
                result[count--]=arr[i];
            }
        }
        while (count>=0){
            result[count--] =0;
        }
        for (int k:result) {
            System.out.print(k+" ");
        }
        System.out.println();

    }

    }

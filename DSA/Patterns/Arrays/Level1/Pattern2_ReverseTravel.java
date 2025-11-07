package DSA.Patterns.Arrays.Level1;

public class Pattern2_ReverseTravel {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArrayInReverse(arr);
        reverseArrayInPlace(arr);
        printAlternativeElementsFromEnd(arr);
        System.out.println("printReverseRecurrsion :");
        int[] array = {11, 22, 33, 44, 55};

        printReverseRecurrsion(array, array.length-1);
        checkPalindrome("madam");
    }
    public static void printArrayInReverse(int arr[]){
        System.out.println("Printing Arrays Elements in Reverse Order :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArrayInPlace(int arr[]){
        int start =0, end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println();
        System.out.println("reversing an array in place");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void printAlternativeElementsFromEnd(int arr[]) {
        System.out.println();
        System.out.println("Printing Alternative Elements From End :");
        for(int i=arr.length-1;i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }

    }
    public static void printReverseRecurrsion(int arr[], int index){
        if(index<0)
            return;
        System.out.println(arr[index]);
        printReverseRecurrsion(arr, index-1);

    }
    public static void checkPalindrome(String s){
        int start=0, end =s.length()-1;
        boolean flag = true;
        while (start< end){
        if (s.charAt(start)!=s.charAt(end)){
            flag = false;
            break;
        }
        start++;
        end--;

        }
        if(flag){
            System.out.println("Palindrom");
        } else{
            System.out.println("Not a Palindrom");

        }
    }


    }

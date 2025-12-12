package DSA.Patterns.Arrays.Level1.Practice;
// ⭐ Pattern 2: Reverse Traversal – 8 Questions
public class Pattern2 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 5, 6, 34, 33, 999};
        // 13. Print elements in reverse order.Print elements in reverse order.
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing Elements in Reversed Order");
        printElementsInReverseOrder(arr);
        // 14. Print alternate elements from the end.
        System.out.println("Printing Alternative Elements from the End");
        printAlternativeElementsFromEnd(arr);
        // 15. Print array elements starting from middle → outward.
        System.out.println("Printing Elements Starting From Middle");
        printElementsFromMiddleTOutward(new int[]{1,2,3,4,5,6});
        // 16. Print every second element in reverse.
        System.out.println("Printing Every Second Element In reverse");
        printEverySecondElementFromLast(arr);
        // 17. Reverse array (do not use extra space).
        System.out.println("Reverse An Array using two pointer technique");
        reverseAnArray(arr);
        // 18. Reverse only the first half of the array.
        System.out.println("Reverse Only First half of An Array");
        reverseOnlyFirstHalfOftheArray(new int[]{1, 2, 3, 4, 5, 6, 5, 6, 34, 33, 999});
        reverseOnlyFirstHalfOftheArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // 19. Reverse only the second half of the array.
        System.out.println();
        System.out.println("Reverse Only Second Half of An Array");
        reverseOnlySecondHalfOftheArray(new int[]{1, 2, 3, 4, 5, 6, 5, 6, 34, 33, 999});
        reverseOnlySecondHalfOftheArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        // 20. Reverse array using recursion.
        System.out.println("reverse An Array using recursion");
        int k[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseAnArrayInrecursion(k, 0, k.length - 1);
        for(int i:k)
            {
                System.out.print(i + " ");
                }
                System.out.println();
}
    public static void printElementsInReverseOrder(int arr[]){
        if(arr == null || arr.length == 0){
            System.out.println("Array is empty or null");
            return;
        }
        System.out.print("Reverse: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printAlternativeElementsFromEnd(int arr[]){
        if(arr == null || arr.length == 0){
            System.out.println("Array is empty or null");
            return;
        }
        System.out.print("Alternate elements from end: ");
        for (int i=arr.length-1;i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printElementsFromMiddleTOutward(int arr[]){
        int result[] = new int[arr.length];
        if(arr ==  null || arr.length == 0) {
            System.out.println("Array is null or empty");
            return;
        }
        int middle = 0;
        int count =1;
        if(arr.length%2 ==0){
            middle = (arr.length/2)-1;
        }else{
            middle = arr.length/2;
        }
        System.out.println("Printing Elements from Middle to Ouward");
        result[0] = arr[middle];
        int left = middle-1;
        int right = middle+1;

        while (left >=0 && right<arr.length){
            result[count++] = arr[left--];
            result[count++] = arr[right++];

        }
        while (left >=0 ){
            result[count++] = arr[left--];

        }
        while (right<arr.length){
            result[count++] = arr[right++];

        }


        for (int k:result){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static void printEverySecondElementFromLast(int arr[]){
        if (arr == null || arr.length ==0) {
            System.out.println("Array is null or empty");
            return;
        }
        for (int i = arr.length-1;i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseAnArray(int arr[]){
        if (arr == null || arr.length ==0) {
            System.out.println("Array is null or empty");
            return;
        }
        int left =0, right = arr.length-1;
        while (left<right){
            int temp =arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("reversed array is ");
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void reverseOnlyFirstHalfOftheArray(int arr[]){
        if (arr == null || arr.length ==0) {
            System.out.println("Array is null or empty");
            return;
        }
        int left = 0, right =(arr.length/2)-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void reverseOnlySecondHalfOftheArray(int arr[]){
        if (arr == null || arr.length ==0) {
            System.out.println("Array is null or empty");
            return;
        }
        int right = arr.length-1, left =(arr.length/2);
        if(arr.length%2!=0){
            left = (arr.length/2)+1;
        }
        while (left<right){
            int temp =arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Second half reversed, the new array is ");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void reverseAnArrayInrecursion(int arr[], int left, int right){
        if(left>=right)
            return;
        int temp =arr[left];
        arr[left] =arr[right];
        arr[right] = temp;
        reverseAnArrayInrecursion(arr, left+1, right-1);
    }
}

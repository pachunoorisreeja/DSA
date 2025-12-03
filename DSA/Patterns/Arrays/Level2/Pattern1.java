package DSA.Patterns.Arrays.Level2;

//
public class Pattern1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //✅ Example 1: Reverse an array in place
        reverseAnArrayInPlace(arr);
        int[] arr1 = {1, 2, 3, 2, 1};
        checkArrayIsPalindrome(arr1);
        int[] arr2 = {1, 2, 3, 4, 6};
        int target = 6;
        twoSumTargetSorted(arr2, target);
        int[] arr3 = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("removeDuplicates");
        int len = removeDuplicates(arr3);
        System.out.println();
        for (int i=0;i<len;i++){
            System.out.print(arr3[i]+"\t");
        }
        int[] arr4 = {2, 1, 5, 1, 3, 2};
        int k=3;
        System.out.println("maxSumOfSubArray "+maxSumOfSubArray(arr4,k));//🧾 Output → 9 (subarray [5, 1, 3])

    }
    public static void reverseAnArrayInPlace(int[] arr) {
    int left =0, right = arr.length-1;
    while (left<right){
        int temp =arr[left];
        arr[left] =arr[right];
        arr[right]= temp;
        left++;
        right--;
    }
    for (int i: arr){
        System.out.println(i);
    }
    }

    public static void checkArrayIsPalindrome(int[] arr) {
        boolean flag = true;
        int left =0, right = arr.length-1;
        while (left<right){
            if(arr[left] != arr[right]){
                flag = false;
                break;
            }
            left++;
            right--;
        }
       if (flag){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not a Palindrome");
       }
    }
    public static void twoSumTargetSorted(int[] arr, int target) {
int left=0, right = arr.length-1;
while (left<right){
    int sum = arr[left]+arr[right];
    if (sum == target){
        System.out.println("Sum of "+arr[left]+" "+arr[right]+" is "+target);
        break;
    }
    else if(sum < target){
        left++;
    }else{
        right --;
    }
}

    }
    public static int removeDuplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static int maxSumOfSubArray(int arr[], int k){

        int windowSum =0;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int max = windowSum;
        for (int end =k;end<arr.length;end++){
            windowSum+=arr[end]-arr[end-k];
            max =Math.max(max, windowSum);
        }

    return max;}

    }

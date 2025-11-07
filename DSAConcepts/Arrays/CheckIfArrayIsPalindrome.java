package DSAConcepts.Arrays;

public class CheckIfArrayIsPalindrome {
    public static void main(String[] args) {

            System.out.println(checkArrayIsPalindrom(new int[]{1,2,3,44,23,11,78}));
        System.out.println(checkArrayIsPalindrom(new int[]{1,2,3,3,2,1}));

    }
    public static boolean checkArrayIsPalindrom(int arr[]){
      int left = 0, right = arr.length-1;
        while (left < right) {

            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

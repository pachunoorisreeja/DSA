package DSA.Logic_Building;

public class SwapTwoNumbers_Naive {
    public static void main(String[] args) {
       int a=10, b=20;
       int temp =a;
       a=b;
       b=temp;
        System.out.println("After swap a is "+a+" and b is "+b);
    }
}
/*
   Time Complexity: O(1)
Auxiliary Space: O(1)
     */

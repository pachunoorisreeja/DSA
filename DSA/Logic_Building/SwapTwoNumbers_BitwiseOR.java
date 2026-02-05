package DSA.Logic_Building;

public class SwapTwoNumbers_Arithmetic {
    public static void main(String[] args) {
       int a=10, b=20;
       a =a+b;
       b=a-b;
       a=a-b;
        System.out.println("After swap a is "+a+" and b is "+b);
    }
}
/*
   Time Complexity: O(1)
Auxiliary Space: O(1)
     */

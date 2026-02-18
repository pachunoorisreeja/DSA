package DSA.Logic_Building;

public class SwapTwoNumbers_BitwiseOR {
    public static void main(String[] args) {
       int a=2, b=3;
       a =a^b;
       b=a^b;
       a=a^b;
        System.out.println("After swap a is "+a+" and b is "+b);
    }}
/*
   Time Complexity: O(1)
Auxiliary Space: O(1)
     */
//2= 010
//3= 011
//a = 110 , 011
//b = 010
//a = 011
// in bitwise when both bits are same it is one else it is zero



package DSA.Logic_Building.Check_Even_or_Odd;

public class Efficient_Approach {
    public static void main(String[] args) {
    int n=10;
        if((n&1)==1) {
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }
    }
}
/*
[Efficient Approach] Using Bitwise AND Operator - O(1) Time and O(1) Space
The last bit of all odd numbers is always 1, while for even numbers it’s 0. So, when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.

Note: Bitwise operators are extremely fast and efficient because they operate directly at the binary level, making them significantly faster than arithmetic or logical operations.


 */

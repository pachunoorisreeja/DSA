package DSA.Logic_Building;

public class SumOfSquaresOfNaturalNumbers_Formula {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(result(n));
    }

    public static int result(int n) {
        int sum = (n*(n+1)*(2*n+1))/6;
        return sum;
    }
}
/*
   Using Mathematical Formulae - O(1) Time and O(1) Space
     */

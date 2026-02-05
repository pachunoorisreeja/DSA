package DSA.Logic_Building;

public class SumOfSquaresOfNaturalNumbers_Naive {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(result(n));
    }

    public static int result(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }
}

    /*
    [Expected Approach] Formula Based Method- O(1) Time and O(1) Space
     */

package DSA.Logic_Building;

public class SumOfNaturalNumbers_Formula {
    public static void main(String[] args) {
        int n=5;
        System.out.println(findSum(n));
    }
    public static int findSum(int n){
        return n*((n+1)/2);
    }
    }
    /*
    [Expected Approach] Formula Based Method- O(1) Time and O(1) Space
     */

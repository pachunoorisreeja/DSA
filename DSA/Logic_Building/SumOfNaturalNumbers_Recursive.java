package DSA.Logic_Building;

public class SumOfNaturalNumbers_Recursive {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
    }

    /*
    [Alternative Approach] Using Recursion -O(n) and O(n) Space
     */
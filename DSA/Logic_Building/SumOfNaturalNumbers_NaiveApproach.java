package DSA.Logic_Building;

public class SumOfNaturalNumbers_NaiveApproach {
    public static void main(String[] args) {
        int n=5;
        int sum =0;
        for(int i=1;i<=5;i++){
           sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
    }
/*
[Naive Approach] Using Loop - O(n) Time and O(1) Space
 */
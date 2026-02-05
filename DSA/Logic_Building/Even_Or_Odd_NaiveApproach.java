package DSA.Logic_Building.Check_Even_or_Odd;

public class NaiveApproach {
    public static void main(String[] args) {
        int n=5;
        if(evenOrOdd(n)){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static boolean evenOrOdd(int number){
        int rem = number % 2;
        if(rem==0){
            return true;
        }else{
            return false;
        }
    }
}
//- O(1) Time and O(1) Space

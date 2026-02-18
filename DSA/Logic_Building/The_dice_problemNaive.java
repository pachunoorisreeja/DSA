package DSA.Logic_Building;

public class The_dice_problemNaive {
    public static void main(String[] args) {
        int i=5;
        int ans =0;
        if(i==1){
            ans = 6;
        }
        else if(i==2){
            ans=5;
        }  else if(i==3){
            ans=4;
        }  else if(i==4){
            ans=3;
        }  else if(i==5){
            ans=2;
        }  else if(i==6){
            ans=1;
        }
        System.out.println("result "+ans);
    }
}

package DSA.Patterns.String.Level1;

import java.util.*;

public class Pattern4_Palindrome {
    public static void main(String[] args) {
        mirrorHalves("abccba");
        mirrorHalves("abcxcba");
        mirrorHalves("abccba");
        mirrorHalves("abccba");
    }

    public static void palindromCheck(String s){
        int left=0,right = s.length()-1;
        while (left < right){
           if (s.charAt(left)!=s.charAt(right)){
               System.out.println("Not a palindrome");
               return;
           }
           left++;
           right--;

        }
        System.out.println("Palindrom");}
    public static void palindromCheck2(String s) {
    String ss = s.replaceAll(" ","").toLowerCase();
        int left=0,right = ss.length()-1;
        while (left < right){
            if (ss.charAt(left)!=ss.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;

        }
        System.out.println("Palindrom");
    }
    public static void mirrorHalves(String s){
        // abccba, abcxcba
        int left=0, right=0 ;
        boolean flag = true;
        if (s.length()%2!=0){
            left = ((s.length()/2)-1);
            right = left+2;
        }else{
            left = ((s.length()/2)-1);
            right = left+1;
        }
        while (left>=0 && right<s.length()){
            if (s.charAt(left)!=s.charAt(right)){
                flag=false;
            }
            left--;
            right++;
        }
if (flag){
    System.out.println("Mirror Halves");
}else {
    System.out.println("Not Mirror Halves");

}
    }

    }

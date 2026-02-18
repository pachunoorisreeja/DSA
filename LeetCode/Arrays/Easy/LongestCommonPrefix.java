package LeetCode.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    public static void main(String[] args) {
       String s[]={"flower","flow","flight"};
        System.out.println("result "+longestPrefix(s));
    }
    public static String longestPrefix(String s[]){
        String first = s[0];
        boolean flag = false;
        String result ="";
        for (int i=0;i<first.length();i++){ // f
            for (int j=0;j<s.length;j++){ // flower,flow,flight
                if (first.charAt(i) != s[j].charAt(i)){

                    flag = false;
                    break;
                }
            }
            if (flag){
                result +=first.charAt(i);
            }

        }

    return result;}

}

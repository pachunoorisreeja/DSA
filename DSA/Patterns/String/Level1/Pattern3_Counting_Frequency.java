package DSA.Patterns.String.Level1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Pattern3_Counting_Frequency {
    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindromIgnoringCasesAndSpaces();
        subStringpalindrome("abba");
        countVowelsConsonants("Sreeja");
        countFrequencyOfEachCharacter("Sreeja");
        firstNonRepatingChar("Sreeja");
        vowelsConsonantsCount("Sreeja");
    }
    //10. Check if a string is a palindrome
    public static void checkPalindrome(String s){
        int left =0, right = s.length()-1;
        boolean flag = true;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Given String is "+(flag?"palindrome":"Not a Palindrome"));
    }
    //11. Palindrome ignoring cases & spaces
    public static void checkPalindromIgnoringCasesAndSpaces(){
        String s = "A man a plan a canal Panama";
        s = s.replaceAll("\\s+", "").toLowerCase();
        int left =0, right = s.length()-1;
        boolean flag = true;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Given String is "+(flag?"palindrome":"Not a Palindrome"));
    }
    //12. Find all palindrome substrings (beginner brute force)
    public static void subStringpalindrome(String s){
        for (int i=0;i<s.length();i++) {
            for (int j = i; j < s.length(); j++) {
                String ss = s.substring(i, j+1);
                if(isPalindrome(ss)){
                    System.out.println(ss);
                }


            }

        }

    }
    public static boolean isPalindrome(String s){
        int left =0, right =s.length()-1;
        boolean flag = true;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag=  false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    public static void countVowelsConsonants(String s){
        String vowels ="aeiouAEIOU";
        int vo=0, con=0;
        for (char c: s.toCharArray()){
            if (Character.isLetter(c)){
                if(vowels.indexOf(c)!=-1){
                    vo++;
                }else{
                    con++;
                }
            }
        }
        System.out.println("Consonants count "+con+" vowels count "+vo);
    }
    public static void countFrequencyOfEachCharacter(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for (char c: map.keySet()){
            System.out.println("char "+c+" count "+map.get(c));
        }
    }
    public static void firstNonRepatingChar(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for (char c: map.keySet()){
           if (map.get(c)==1){
               System.out.println("first non repeating char is "+c);
               return;
           }
        }
    }
    public static void vowelsConsonantsCount(String s){
        int v=0,con=0;
        String vowels ="aeiouAEIOU";
        for(char c: s.toCharArray()){
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1){
                    v++;}else {
                    con++;
                }

            }
        }
        System.out.println("Vowels count: "+v+" consonants: "+con);
    }
}

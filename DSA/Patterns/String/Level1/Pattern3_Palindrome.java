package DSA.Patterns.String.Level1;

public class Pattern3_Palindrome{
    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindromIgnoringCasesAndSpaces();
        subStringpalindrome("abba");
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
}

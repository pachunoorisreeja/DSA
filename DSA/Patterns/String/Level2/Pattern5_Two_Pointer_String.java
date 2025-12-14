package DSA.Patterns.String.Level2;

import java.util.Arrays;

public class Pattern5_Two_Pointer_String {
    public static void main(String[] args) {
        removeExtraSpacesFromString("  I love india   ");
        removeAllOccurrencesOfAChar("banana",'a');
        checkStringAnagrams("listen", "silent");
        anagramsUsingFrequencyMethod("listen", "silent");
    }
    public static void removeExtraSpacesFromString(String s){
        StringBuilder sb = new StringBuilder();
        int n =s.length();
        int i=0;
        // remove initial spaces
        while (i<n && s.charAt(i)==' '){
            i++;
        }
        while (i<n){
            if (s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            } else if(sb.length()>0 && sb.charAt(sb.length()-1) !=' '){
                sb.append(" ");
            }
            i++;
        }
        if (sb.length()>0 && sb.charAt(sb.length()-1) ==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }

    public static void removeAllOccurrencesOfAChar(String s, char cc){
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if (c!=cc){
                sb.append(c);
            }

        }
        System.out.println("Final String is "+sb.toString());
    }

    public static void checkStringAnagrams(String s, String ss){
        if (s.length()!=ss.length())
        {
            System.out.println("Not Anagrams");
            return;
        }
        char c[] = s.toCharArray();
        char cc[] = ss.toCharArray();
        Arrays.sort(c);
        Arrays.sort(cc);
        if (Arrays.equals(c,cc)){
            System.out.println("Anagrams");
        }
    }
    public static void anagramsUsingFrequencyMethod(String s, String ss){
        if (s.length()!=ss.length()){
            System.out.println("Not Anagrams");
            return;
        }
        int frequency[] = new int[256];
        for (char c: s.toCharArray()){
            frequency[c]++;
        }
        for (char cc: ss.toCharArray()){
            frequency[cc]--;
        }
        for (int f:frequency){
            if (f!=0){
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");}
}

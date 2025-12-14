package DSA.Patterns.String.Level2;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class Pattern6_SlidingWondow {
    public static void main(String[] args) {
        // ⭐ 22. Longest substring without repeating characters
        longestSubStringWIthoutRepeatingChars("abcabcbb");
        // ⭐ 23. Longest substring with K distinct characters
        lengthOfLongestSubstringKDistinct("eceba",2);
        // ⭐ 24. Smallest substring containing all characters of a pattern
        // ⭐ 25. Find substring with exactly K vowels
        // ⭐ 26. Longest substring with same characters after K replacements
    }
    public static void longestSubStringWIthoutRepeatingChars(String s){
        int left =0, max=0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            if (map.get(c)>1){
                map.put(c, map.get(c)-1);
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        System.out.println("longestSubStringWIthoutRepeatingChars "+max);
    }
    public static void lengthOfLongestSubstringKDistinct(String s, int k){
        int left = 0;
        int max =0;
        HashMap<Character, Integer> map = new HashMap<>();
        if (s==null || s.length() ==0 || k==0){
            System.out.println("Invalid");
            return;
        }
        for (int right =0;right<s.length();right++) {
            char ch =  s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0)+1);
            while (map.size()>k){
                char leftChar = s.charAt(left);
                map.put(ch, map.get(leftChar)-1);
                if (map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, right - left+1);
        }
        System.out.println("Max "+max);

    }
}
/*

🔍 Step-by-Step Example:

String: "eceba", k = 2
| Step | Window | Distinct | Action           |
| ---- | ------ | -------- | ---------------- |
| 1    | e      | {e}      | ok               |
| 2    | ec     | {e,c}    | ok               |
| 3    | ece    | {e,c}    | ok → longest = 3 |
| 4    | eceb   | {e,c,b}  | >2 → shrink      |
|      | ceb    | {c,e,b}  | still 3 distinct |
|      | eb     | {e,b}    | now valid        |
| 5    | eba    | {e,b,a}  | >2 → shrink      |
|      | ba     | {b,a}    | valid            |

 */

package DSA.Patterns.String.Level1;

import javax.swing.*;
import java.util.*;

public class Pattern4_FrequencyCounting{
    public static void main(String[] args) {
        countFrequency("banana");
        firstNonRepeatingCharacter();
        firstRepeatingChar();
    }
    //
    //14. Frequency using HashMap
    public static void countFrequency(String s){
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
           map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }

    //15. First non-repeating character
    public static void firstNonRepeatingCharacter(){
        String s ="swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c:s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }

        }
        for(char c: map.keySet()){
            if(map.get(c)==1){
                System.out.println("First Non Repeating Character is: "+c);
                break;
            }
        }
    }

    //16. First repeating character
    public static void firstRepeatingChar(){
        String s ="swiss";
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(!set.add(c)){
                System.out.println("First Repeating Character is "+c);
                break;
            }

        }
    }
}

package DSA.Patterns.Arrays.Level1.Practice;

import java.util.HashMap;
import java.util.Map;

//⭐ Pattern 5: Counting / Frequency – 10 Questions
public class Pattern5 {
    public static void main(String[] args) {
        // 41. Count frequency of all elements
        countFrequencyOfAllElements(new int[]{1,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 42. Find the element that appears maximum times.
        elementThatAppearsMaxTimes(new int[]{1,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 43. Find the element that appears minimum times.
//        elementThatAppearsMinTimes(new int[]{1,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 44. Count how many elements appear exactly twice.
        elementThatAppearsExactlyTwice(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 45. Count how many elements appear more than twice.
        elementThatAppearsMoreThanExactlyTwice(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 46. Find unique elements (frequency = 1).
        elementThatAppearsExactlyOnce(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 47. Find duplicate elements (frequency > 1).
        elementThatAppearsMoreThanOnce(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 48. Count distinct elements in the array.
        elementThatAppearsExactlyOnce(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 49. Check if all elements in the array are unique.
        checkIfAllAreUnique(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
        // 50. Count how many elements appear an odd number of times.
        checkHowManyAppearsOddNumberOfTimes(new int[]{1,14,23,34,23,23,56,34,56,78,78,78,78,78,1});
    }
    public static void countFrequencyOfAllElements(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        for (int key: map.keySet()){
            System.out.println("Frequency of "+key+" is "+ map.get(key));
        }
    }
    public static void elementThatAppearsMaxTimes(int arr[]){
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int value=0;
        for (int key: map.keySet()){
            if (map.get(key)>max){
                max=map.get(key);
                value =key;
            }

        } System.out.println("Element That occurs max number of times is "+value);
    }
    public static void elementThatAppearsMinTimes(int arr[]){
        int min = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int value=0;
        for (int key: map.keySet()){
            if (map.get(key)<min){
                min=map.get(key);
                value =key;
            }

        }System.out.println("Element That occurs min number of times is "+value);
    }
    public static void elementThatAppearsExactlyTwice(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count=0;
        for (int key: map.keySet()){
            if (map.get(key)==2){
                count++;
            }

        }System.out.println("Number of Elements that appears twice "+count);
    }
    public static void elementThatAppearsMoreThanExactlyTwice(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count=0;
        for (int key: map.keySet()){
            if (map.get(key)>2){
                count++;
            }

        }System.out.println("Number of Elements that appears more than twice "+count);
    }
    public static void elementThatAppearsExactlyOnce(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count =0;
        System.out.println("Number of Elements that appears Once Are ");
        for (int key: map.keySet()){
            if (map.get(key)==1){
                System.out.print(key+" ");
                count++;
            }

        }
        System.out.println("Distinct Element in given array are :"+count);
    }
    public static void elementThatAppearsMoreThanOnce(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        System.out.println("Number of Elements that appears more than Once are ");
        for (int key: map.keySet()){
            if (map.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }
    public static void checkIfAllAreUnique(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = true;
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        System.out.println("Number of Elements that appears more than Once are ");
        for (int key: map.keySet()){
            if (map.get(key)>1){
                flag=false;
            }
        }
        System.out.println(false?"Unique":"Not unique");}
    public static void checkHowManyAppearsOddNumberOfTimes(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i:arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        System.out.println("Number of Elements that appears more than Once are ");
        for (int key: map.keySet()){
            if (map.get(key)%2!=0){
               count++;
            }
        }
        System.out.println(count+" number are there that appears odd number of times");}
}

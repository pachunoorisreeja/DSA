package DSA.Patterns.Arrays.Level1;

import java.util.HashMap;
import java.util.Map;

public class Pattern5_Couting_Frequency {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 5, 1, 3};
        int target =5;
//        Logic: Simple linear traversal — increase a counter when you find the target.
        countFrequencyOfNumber(arr,target);
//        ⚡ Problem 3: Count frequency of all elements using HashMap (optimized)
//
//        The most efficient and widely used method (O(n)).
        countFrequencyOfEachNumber(arr);
        findMostFrequentOne(arr);
        countUniqueElement(arr);
    }
    public static void countFrequencyOfNumber(int[] arr, int target){
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
    }
        System.out.println("Target Element "+target+" found "+count+" times");
    }
    public static void  countFrequencyOfEachNumber(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
        }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Count of "+entry.getKey()+" is "+entry.getValue());
        }
    }
    public static void findMostFrequentOne(int[] arr){
        int mostFrequentElement = 0, max=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
           if(entry.getValue()> max){
               max = entry.getValue();
               mostFrequentElement = entry.getKey();
           }
        }
        System.out.println("Most Frequent Element is "+mostFrequentElement);
    }

    public static void countUniqueElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Unique Elements are :");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }

        }

    }
    }

package DSA.Patterns.Arrays.Level2;

import java.util.*;

public class Pattern6_Frequency_CountingPattern {
    public static void main(String[] args) {
        // 1. Count frequency of each element in the array
        countFreuquencyOfEachElement(new int[]{1,4,3,6,8,1,6,1,7,2,9,10});
        // 2. Count occurrences of a given number X
        countFrequecyOfGivenNumber(new int[]{1,2,3,1,1},1);
        // 3. Find all elements that appear more than once
        findAllElementsThatAppearsMoreThanOnce(new int[]{1,2,3,4,3,2,1,1});
        // 4. Print element → frequency mapping
        countFreuquencyOfEachElement(new int[]{1,4,3,6,8,1,6,1,7,2,9,10});
        // 5. Find the most frequent element (Mode)
        mostFrequentElement(new int[]{1,4,3,6,8,1,6,1,7,2,9,10});
        // 6. Find top K frequent elements
        findTopKFrequentElements(new int[]{1,2,3,6,7,1,1,4,2,5,26,7},2);
        // 7. Check if two arrays are equal (same frequency of elements)
        sameFrequencyOfElements(new int[]{1,3,2,4},new int[]{4,2,1,3});
        // 8. Check if two arrays are anagrams (same multiset)
        anagrams(new int[]{1,2,3,4}, new int[]{4,2,3,1});
        // 9. Majority Element (> n/2 times)
        majorityELements(new int[]{1,2,3,2,2});
        // 10. Majority Element II (> n/3 times)
        majorityELementsII(new int[]{1,1,1,3,3,2,2,2});
        // 11. Find Missing Number
        missingNumber1(new int[]{0,1,2,3,4});
        missingNumber2(new int[]{1,2,3,4,5});
        missingNumber2(new int[]{0,1,2,3,4});
        // 12. Find Duplicates in an Array
        findTheDuplicatesInAnArray(new int[]{1,2,3,3,3,4,2,2,2,2,1});
        // 13. Find Missing and repeatative number
        findMissingAndRepeatativeNumber(new int[]{4, 3, 6, 2, 1, 1});
        // 14. Count the number that appears exactly once
        countUniqueNumbers(new int[]{1,2,3,4,4,2});
        // 15. Count numbers appearing at least twice
        countNumbersAppearsAtleasttwice(new int[]{1,2,3,3,3,4,2,2,2,2,1});
        // 16. Check if all element frequencies are unique
        chekAllElementsAreUnique(new int[]{12,3,455,76});
        // 17. Count pairs whose sum is even (frequency trick)
        countPairsWhoseSumEven(new int[]{1,2,3,4,3});
        // 18. Count subarrays with sum = K (prefix frequency)
        // 19. Longest subarray with equal 0s and 1s (freq + prefix)
        // 20. Find first non-repeating element

    }
    public static void countFreuquencyOfEachElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Frequecy of "+entry.getKey()+" is "+ entry.getValue());
        }
    }

    public static void countFrequecyOfGivenNumber(int arr[], int x){
        int count =0;
        for(int i:arr){
            if(i==x){
                count++;
            }
        }
        System.out.println("Frequency of "+x+" is "+count);
    }

    public static void findAllElementsThatAppearsMoreThanOnce(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for (int key: map.keySet()){
            if(map.get(key)>1) {
                System.out.println(key+" Key is having Frequency "+map.get(key));
            }
        }
        }

    public static void mostFrequentElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }

        }
        int max = Integer.MIN_VALUE;
        int value = 0;
        for (int key: map.keySet()){
            if (map.get(key)>max){
                max=map.get(key);
                value = key;
            }
        }
        System.out.println("MostFrequent Element is "+value);
    }
    public static void findTopKFrequentElements(int[] arr,int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        System.out.println("Elements repeating more than once are:");
        for (int key: map.keySet()){
            if (map.get(key) >=2){
                System.out.println(key+" ");
            }
        }
        System.out.println();
    }

    public static void sameFrequencyOfElements(int a[], int b[]){
        if (a.length!=b.length){
            System.out.println("Not same frequency arrays");
            return;
        }
        Map<Integer, Integer> aMap = new HashMap<>();
        Map<Integer, Integer> bMap = new HashMap<>();
        for (int i: a){
            if (aMap.containsKey(i)){
                aMap.put(i, aMap.get(i)+1);
            }else {
                aMap.put(i, 1);
            }
        }

        for (int i: b){
            if (bMap.containsKey(i)){
                bMap.put(i, bMap.get(i)+1);
            }else {
                bMap.put(i, 1);
            }
        }
        if (aMap.size()!=bMap.size())
        {
            System.out.println("Not same frequency arrays");
            return;
        }
        for (int key: aMap.keySet()){
            if (!bMap.containsKey(key)){
                System.out.println("Not same frequency arrays");
                return;
            }
            if (aMap.get(key)!=bMap.get(key)){
                System.out.println("Not same frequency arrays");
                return;
            }
        }System.out.println("Same frequency arrays");
    }

    public static void anagrams(int a[], int b[]){
        if (a.length!=b.length){
            System.out.println("Not anagrams");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int aa:a){
            if (map.containsKey(aa)){
                map.put(aa, map.get(aa)+1);
            }else{
                map.put(aa, 1);
            }
        }
        for (int bb:a){
            if(!map.containsKey(bb)){
                System.out.println("Not anagrams");
                return;
            }
            map.put(bb, map.get(bb)-1);
        }
        for (int values: map.values()){
            if (values!=0){
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }

    public static void majorityELements(int arr[]){
        if (arr ==null || arr.length==0) {
            System.out.println("Arr is null or emprty");
            return;
        }
        int n = (arr.length/2);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int keys: map.keySet()){
            if (map.get(keys)> n){
                System.out.println("Majority Element is "+keys);
                return;
            }
        }System.out.println("No Majority Element");
    }

    public static void majorityELementsII(int arr[]){
        if (arr ==null || arr.length==0) {
            System.out.println("Arr is null or emprty");
            return;
        }
        int n = (arr.length/3);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int keys: map.keySet()){
            if (map.get(keys)> n){
                System.out.println("Majority Element is "+keys);
                return;
            }
        }System.out.println("No Majority Element");
    }

    public static void missingNumber1(int arr[]){
        int len = arr.length;
        int expectedSum = len*(len+1)/2;
        int actualSum =0;
        for (int a:arr){
            actualSum +=a;
        }
        System.out.println("Missing Number is "+(expectedSum-actualSum));
    }
    public static void missingNumber2(int arr[]){
        int xor = 0;
        for (int a:arr){
           xor^=a;
        }
        for (int i=1;i<=arr.length;i++){
            xor^=i;
        }
        System.out.println("Missing Number is "+(xor));
    }

    public static void findTheDuplicatesInAnArray(int arr[]){
        Map<Integer, Integer> map = new HashMap<>();
        for (int a: arr){
          if (map.containsKey(a)){
              map.put(a, map.get(a)+1);
          }else {
              map.put(a, 1);
          }
        }
        System.out.println("Duplicate are :");
        for (int key: map.keySet()){
            if (map.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }

    public static void findMissingAndRepeatativeNumber(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> map = new TreeMap<>();

        // Count frequency
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int repeating = -1;
        int missing = -1;

        // 1️⃣ Detect repeating number
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                repeating = key;
                break;
            }
        }

        // 2️⃣ Detect missing number (must check full range 1..n)
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        System.out.println("Repeating Number = " + repeating);
        System.out.println("Missing Number   = " + missing);
    }
    public static void countUniqueNumbers(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count =0;
        System.out.println("No of Elements appears once are: ");
        for (int key: map.keySet()){
            if (map.get(key) ==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void countNumbersAppearsAtleasttwice(int arr[]){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count =0;
        System.out.println("No of Elements appears atleast twice are: ");
        for (int key: map.keySet()){
            if (map.get(key) >=2){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void chekAllElementsAreUnique(int arr[]){
    boolean flag = true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        int count =0;
        System.out.println("No of Elements appears atleast twice are: ");
        for (int key: map.keySet()){
            if (map.get(key) !=1){
                flag = false;
                System.out.println("not unique");
                return;
            }
        }
            System.out.println("unique");
    }
    public static void countPairsWhoseSumEven(int arr[]){
        if (arr == null || arr.length < 2) {
            System.out.println("Total No of Pairs is 0");
            return;
        }

        int evenParis = 0, oddPairs = 0;
        for (int i:arr){
            if (i%2==0){
                evenParis++;
            }else{
                oddPairs++;
            }
        }
        System.out.println("Total No of Pairs is "+((evenParis*(evenParis-1)/2)+(oddPairs*(oddPairs-1)/2)));
    }
    }

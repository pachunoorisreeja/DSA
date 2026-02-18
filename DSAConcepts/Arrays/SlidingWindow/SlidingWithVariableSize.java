package DSAConcepts.Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWithVariableSize {
    public static void main(String[] args) {
        System.out.println("longestSubarrayWithSumAtMostK "+longestSubarrayWithSumAtMostK(new int[]{4,1,1,1,2,3,5},5));
        System.out.println("minSubarrayLength "+minSubarrayLength(new int[]{2,3,1,2,4,3},7));
        System.out.println("longestSubarrayAtMostKDistinct "+longestSubarrayAtMostKDistinct(new int[]{1,2,1,2,3},2));




    }
    // Pattern 1: Longest Subarray (Condition Based)
    //Example:
    //Longest subarray with sum ≤ K (positive numbers only) output: [1,1,1,2] → 5   ← length = 4 (maximum)
    public static int longestSubarrayWithSumAtMostK(int arr[], int k){
    int sum =0, maxLen =0; int left=0;
    for (int right =0;right< arr.length;right++){
        sum+=arr[right];
        while (sum > k){
            sum-=arr[left];
            left++;
        }
        maxLen = Math.max(maxLen, right - left+1);
    }
    return maxLen;}

    // Pattern 2: Minimum Length Subarray input: [2,3,1,2,4,3], K=7, output: 2
    public static int minSubarrayLength(int arr[], int k){
        int minLen = Integer.MAX_VALUE;
        int sum=0;
        int left =0;
        for(int right =0;right<arr.length;right++){
            sum+=arr[right];
            while (sum >=k){
                minLen = Math.min(minLen, right-left+1);
                sum-=arr[left];
                left++;
            }
        }

        return minLen;
    }
    // Pattern 3: At Most K Distinct Elements -> Longest substring with at most K distinct characters.
    public static int longestSubarrayAtMostKDistinct(int arr[], int k){
        Map<Integer, Integer> map = new HashMap<>();
        int len =0, maxLen =0, left=0;
        for (int right =0;right<arr.length;right++){
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
            while (map.size()>k){
                map.put(arr[left], map.get(arr[left])-1);
                if (map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);

        }
   return maxLen; }

}

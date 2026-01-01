package DSA.Stack;

import java.util.ArrayList;

public class NextGreaterElementInArrayNaiveApproach {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] = {1, 3, 2, 4};
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            flag = false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    flag = true;
                    res.add(arr[j]);
                    break;

                }
            }
            if (!flag){
                res.add(-1);
            }
        }
        System.out.println(res);
    }
}

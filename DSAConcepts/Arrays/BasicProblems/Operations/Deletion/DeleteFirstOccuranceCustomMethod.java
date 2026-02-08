package DSAConcepts.Arrays.BasicProblems.Operations.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFirstOccurance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,5,6,7,8,3,9,10));
        list.remove(Integer.valueOf(3));
        System.out.println(list);
    }
}

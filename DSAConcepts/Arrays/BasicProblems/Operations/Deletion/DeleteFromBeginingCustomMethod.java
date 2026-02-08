package DSAConcepts.Arrays.BasicProblems.Operations.Deletion;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteFromBegining {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.remove(0);
        System.out.println(list);
        System.out.println("\nArray after insertion");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
/* Time Complexity: O(n), where n is the size of the array.*/

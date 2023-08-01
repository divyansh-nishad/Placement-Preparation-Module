import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSorted {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // brute force
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int count = 0;
        for (int i : set) {
            arr.set(count, i);
            count++;
        }
        return set.size();
    }

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // optimized
        // Write your code here.
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr.get(i) != arr.get(j)) {
                i++;
                arr.set(i, arr.get(j));
            }
        }
        return i + 1;
    }

}

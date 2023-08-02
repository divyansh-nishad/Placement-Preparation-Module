import java.util.*;

public class UnionOfTwoSortedArrays {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        int prev = -1;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (prev != a[i]) {
                    prev = a[i];
                    list.add(a[i]);
                }
                i++;
            } else {
                if (prev != b[j]) {
                    prev = b[j];
                    list.add(b[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (prev != a[i]) {
                prev = a[i];
                list.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            if (prev != b[j]) {
                prev = b[j];
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }

}

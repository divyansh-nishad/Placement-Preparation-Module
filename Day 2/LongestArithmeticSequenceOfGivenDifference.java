import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSequenceOfGivenDifference {
    class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i =0;i<arr.length;i++)
        {
            int c = arr[i];
            if(hm.containsKey(c-difference))
            {
                hm.put(c,hm.get(c-difference)+1);
            }
            else
            {
                hm.put(c,1);
            }
            max = Math.max(max,hm.get(c));
        }
        return max;
    }
}
    
}

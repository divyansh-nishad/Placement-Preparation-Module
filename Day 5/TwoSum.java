import java.util.HashMap;

public class TwoSum {

    
}
class Solution 
{
    //using hashmap
    // time complexity O(n)
    // space complexity O(n)
    public int[] twoSum(int[] nums, int target) 
    {
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
           if(hm.containsKey(target-nums[i]))
           {
               return new int[]{hm.get(target-nums[i]),i};
           }
           hm.put(nums[i],i);
       }
       return new int[]{0,0};        
    }
}
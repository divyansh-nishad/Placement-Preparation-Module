public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
            xor^=nums[i];
        return xor;
    }
    
}
class Solution {
    // using hashmap
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)==1)
                return i;
        }
        return -1;
    }
}

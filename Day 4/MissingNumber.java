public class MissingNumber {
    public int missingNumber(int[] nums) {
        //using XOR approach
        int x=0;
        for(int i=1;i<=nums.length;i++)
            x^=i;
        for(int i=0;i<nums.length;i++)
            x^=nums[i];
        return x;
    }
    
}
class Solution {
    public int missingNumber(int[] nums) {
        //using sum approach
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }
}
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

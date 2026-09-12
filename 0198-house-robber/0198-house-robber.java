class Solution {
    public int rob(int[] nums) {
        return recur(nums,0);
    }
    private int recur(int nums[],int i){
        if(i>=nums.length){
            return 0;
        }
        int take=nums[i]+recur(nums,i+2);
        int skip=recur(nums,i+1);
        return Math.max(take,skip);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
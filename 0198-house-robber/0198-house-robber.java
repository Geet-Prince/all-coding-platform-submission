class Solution {
    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return solve(nums,memo,0);
    }
    private int solve(int nums[],int memo[],int i){
        if(i>=nums.length)
        {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }

        int select=nums[i]+solve(nums,memo,i+2);
        int skip=solve(nums,memo,i+1);
        memo[i] = Math.max(select, skip);
        return memo[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
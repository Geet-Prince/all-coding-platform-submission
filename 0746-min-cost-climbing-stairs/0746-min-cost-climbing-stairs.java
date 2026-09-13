class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length-1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,dp,n),solve(cost,dp,n-1));
    }
    private int solve(int cost[],int dp[],int n){
        if(n<=1){
            return cost[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=cost[n]+Math.min(solve(cost,dp,n-1),solve(cost,dp,n-2));

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
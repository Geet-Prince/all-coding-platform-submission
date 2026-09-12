class Solution {
    public int climbStairs(int n) {
        int memo[]=new int[n+1];
        Arrays.fill(memo,-1);
        return ways(n,memo);
    }
    private int ways(int n,int memo[]){
        if(n<=2){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=ways(n-1,memo)+ways(n-2,memo);
        return memo[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
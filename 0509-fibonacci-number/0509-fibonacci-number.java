class Solution {
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        int prev0=0;
        int prev1=1;
        for(int i=2;i<=n;i++){
            int cur=prev0+prev1;
            prev0=prev1;
            prev1=cur;
        }
        return prev1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
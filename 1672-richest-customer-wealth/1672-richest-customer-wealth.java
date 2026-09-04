class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        int m= accounts.length;
        int n=accounts[0].length;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+accounts[i][j];
            }
            max_wealth=Math.max(max_wealth,sum);
        
        }
        return max_wealth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
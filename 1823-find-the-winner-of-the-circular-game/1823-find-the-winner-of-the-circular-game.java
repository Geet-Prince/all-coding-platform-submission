class Solution {
    public int findTheWinner(int n, int k) {
        int res=0;
        for(int i=1;i<=n;i++){
            res=(res+k)%i;
        }return res+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
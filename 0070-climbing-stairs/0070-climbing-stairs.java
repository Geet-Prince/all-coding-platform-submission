class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int tabu[]=new int[n+1];
        
        tabu[1]=1;
        tabu[2]=2;
        for(int i=3;i<=n;i++){
            tabu[i]=tabu[i-1]+tabu[i-2];
        }
        return tabu[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
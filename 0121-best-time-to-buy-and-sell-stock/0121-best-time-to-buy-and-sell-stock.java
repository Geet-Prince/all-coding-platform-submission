class Solution {
    public int maxProfit(int[] prices) {
        int Lowestprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            Lowestprice=Math.min(Lowestprice,prices[i]);
            maxprofit=Math.max(prices[i]-Lowestprice,maxprofit);
        }
        return maxprofit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
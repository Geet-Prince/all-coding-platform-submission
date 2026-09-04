class Solution {
    public int maxProductDifference(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<smallest){
                secondSmallest=smallest;
                smallest=nums[i];
            }
            else if(nums[i]<secondSmallest) {
                secondSmallest=nums[i];
            }
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondLargest){
                secondLargest=nums[i];
            }
        }return (largest*secondLargest)-(smallest*secondSmallest);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
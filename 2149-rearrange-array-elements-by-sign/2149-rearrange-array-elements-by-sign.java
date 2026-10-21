class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int neg_pos=1;
        int pos_pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[pos_pos]=nums[i];
                pos_pos+=2;
            }
            else{
                res[neg_pos]=nums[i];
                neg_pos+=2;
            }
        }return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
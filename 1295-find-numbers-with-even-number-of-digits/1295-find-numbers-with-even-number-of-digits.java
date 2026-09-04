class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(check(nums[i])){
                count++;
            }
            
        }return count;
    }
    boolean check(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
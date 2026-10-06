class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0,high = nums.length- 1;
        while(mid<=high){
            if (nums[mid] == 0) {
                swap(nums,mid, low);
                low++;
                mid++;
            }
            else if (nums[mid]==1) {
                mid++;
            }
            else {
                swap(nums,mid,high);;
                high--;
            }
        }
        
    }
    private void swap(int[] nums, int n1, int n2) {
        int temp=nums[n1];
        nums[n1]=nums[n2];
        nums[n2]=temp;
        }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
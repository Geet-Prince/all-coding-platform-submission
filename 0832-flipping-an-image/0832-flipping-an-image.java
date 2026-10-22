
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for (int i=0;i<n;i++) {
            int st=0;
            int end=m-1;
            while (st<end) {
                int temp=image[i][st];
                image[i][st]=image[i][end];
                image[i][end]=temp;
                st++;
                end--;
            }
            for (int j=0;j<m;j++) {
                if (image[i][j]==1) {
                    image[i][j]=0;
                } else {
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
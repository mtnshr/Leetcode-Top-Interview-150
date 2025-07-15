class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
    
        //Edge cases where nums contains 0 or 1 integers or k > n //
        if (n == 0 || n == 1 || k%n == 0) {
            //Do nothing//
        }

        //Adjusting k to be smaller then n//
        else if (n > 0) {
            k = k%n;
    
            for(int i = 0; i < n/2; i++ ) {
                int temp;
                temp = nums[i];
                nums[i] = nums[n-1-i];
                nums[n-1-i] = temp;  
            }
            for(int i = 0; i < k/2 ; i++) {
                int temp;
                temp = nums[i];
                nums[i] = nums[k-1-i];
                nums[k-1-i] = temp; 
            }
            for (int i = 0; i <= (n-k-1)/2 ; i++) {
                int temp;
                temp = nums[k+i];
                nums[k+i] = nums[n-1-i];
                nums[n-1-i] = temp;
            }
        }
    }
}
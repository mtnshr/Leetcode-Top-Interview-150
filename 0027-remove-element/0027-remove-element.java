class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // This will count the number of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Optionally, we can fill the rest of the array with any value
        // For example, we could fill it with -1 or leave it as is
        
        return k;
    }
}
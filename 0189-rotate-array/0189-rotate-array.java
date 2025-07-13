class Solution {
    public void rotate(int[] nums, int k) {
        int[] new_nums = new int[nums.length];
        k = k % nums.length;
        for (int i = 0; i <= nums.length-1; i++) {
            new_nums[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0; i <= nums.length-1; i++) {
            nums[i] = new_nums[i];
        }
    }
}
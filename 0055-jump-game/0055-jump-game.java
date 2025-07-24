class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false; // We can't reach this position
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
            if (maxReachable >= nums.length - 1) {
                return true; // We can reach or pass the last index
            }
        }
        return true; // If loop finishes, we can reach the end
    }
}
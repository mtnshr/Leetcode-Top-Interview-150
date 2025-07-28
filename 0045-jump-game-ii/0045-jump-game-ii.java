class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int maxReach = 0; // the furthest index we can reach so far
        int endOfRange = 0; // the end of the current jump range

        for (int i = 0; i < nums.length - 1; i++) {
            // Update maxReach 
            if (i + nums[i] > maxReach) {
                maxReach = i + nums[i];
            }
            // When we've reached the end of the current range, need to jump again
            if (i == endOfRange) {
                jumps++;
                endOfRange = maxReach;
            }
        }
        return jumps;
    }
}
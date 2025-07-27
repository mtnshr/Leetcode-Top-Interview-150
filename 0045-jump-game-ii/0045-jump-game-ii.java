class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int maxReach = 0; // the furthest index we can reach so far
        int endOfRange = 0; // the end of the current jump range

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            // When we've reached the end of the current range, need to jump again
            if (i == endOfRange) {
                jumps++;
                endOfRange = maxReach;
                // If we can reach or pass the last index, stop counting
                if (endOfRange >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
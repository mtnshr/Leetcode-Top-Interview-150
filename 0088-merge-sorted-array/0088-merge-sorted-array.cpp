class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // Edge case: If nums2 is empty, nothing to do.
        if (n == 0) {
        } else {
            // Pointer for nums1 and nums2 and the merged array Ans
            int i = m-1;
            int j = n-1;
            int k = m+n-1;

            // Merge the two arrays
            while (i >= 0  && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
            // If there are remaining elements in nums2
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            
        }
    }
};
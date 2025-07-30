class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n+1]; //Create an empty array in the size of citations
        int HIndex = 0;

        //Fill the empty array with 0 values.
        for (int i = 0; i <= n; i++) {
            counts[i]= 0;
        }

        //Fill the array counts with each citation's instances frequency
        for (int j = 0; j <= n-1; j++) {
            if (citations[j] < n) {
                counts[citations[j]]++;
            } else { 
                counts[n]++;
            }
        }
        int sum = 0;

        // Check what's the maximum H index.
        for (int k = n; k >= 0 ; k--) {
            sum = sum + counts[k];
            if (sum >= k) {
                HIndex = k;
                k = -1;
            }
        }
        return HIndex;
    } 
}

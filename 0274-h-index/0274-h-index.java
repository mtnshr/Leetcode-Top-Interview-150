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
        for (int i = 0; i <= n-1; i++) {
            if (citations[i] < n) {
                counts[citations[i]]++;
            } else { 
                counts[n]++;
            }
        }
        int sum = 0;

        // Check what's the maximum H index.
        for (int i = n; i >= 0 ; i--) {
            sum = sum + counts[i];
            if (sum >= i) {
                HIndex = i;
                i = -1;
            }
        }
        return HIndex;
    } 
}

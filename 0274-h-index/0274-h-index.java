class Solution {
    public int hIndex(int[] citations) {
        int[] counts = new int[citations.length+1]; //Create an empty array in the size of citations
        int HIndex = 0;

        //Fill the empty array with 0 values.
        for (int i = 0; i <= citations.length; i++) {
            counts[i]= 0;
        }

        //Fill the array counts with each citation's instances frequency
        for (int i = 0; i <= citations.length-1; i++) {
            if (citations[i] < citations.length) {
                counts[citations[i]]++;
            } else { 
                counts[citations.length]++;
            }
        }
        int sum = 0;

        // Check what's the maximum H index.
        for (int i = citations.length; i >= 0 ; i--) {
            sum = sum + counts[i];
            if (sum >= i) {
                HIndex = i;
                i = -1;
            }
        }
        return HIndex;
    } 
}

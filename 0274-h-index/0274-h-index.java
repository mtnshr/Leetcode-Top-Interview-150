class Solution {
    public int hIndex(int[] citations) {
        int HIndex = 0;
        int n = citations.length; 
        for (int i = 0; i <= n; i++) {
            int counter = 0;
            for (int j = 0; j < n; j++) {
                if (citations[j] >= i) {
                    counter++;
                }
            }
            if (counter >= i && i > HIndex) {
                HIndex = i;
            }
        }
        return HIndex;
    } 
}

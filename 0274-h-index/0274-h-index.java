import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hIndex = 0;

        for (int i = n - 1; i >= 0; i--) {
            int hCandidate = n - i;
            if (citations[i] >= hCandidate) {
                hIndex = hCandidate; // update to the higher valid h
            }
        }
        return hIndex;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i=1; i <= prices.length-1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] == min) {
                //do nothing
            }
            else if (prices[i]> min) {
                int delta = prices[i] - min;
                if (profit < delta) {
                    profit = delta;
                }
            }
        } return profit;
    }
}
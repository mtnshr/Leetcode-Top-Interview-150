class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int curr = prices[0];
        int sell;
        for (int i = 1; i <= prices.length-1; i++) {
            sell = prices[i];
            if (curr >= sell) {
                //do nothing
            } else if (curr < sell){
                profit = profit + (sell-curr);
            }
            curr = prices[i];
        } return profit;
    }
}
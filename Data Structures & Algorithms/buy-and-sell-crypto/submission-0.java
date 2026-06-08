class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_sell_value = prices[0];
        for(int price: prices){
            max_profit = Math.max(max_profit, price - min_sell_value);
            min_sell_value = Math.min(min_sell_value, price);
        }
        return max_profit;
    }
}

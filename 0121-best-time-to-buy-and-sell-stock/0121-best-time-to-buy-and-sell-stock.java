class Solution {
    public int maxProfit(int[] prices) {
        
        int Buying = prices[0];
        int profit = 0;
int n = prices.length;

        for(int i=1;i<n;i++){
            if(prices[i] < Buying){
                Buying = prices[i];
            }else if( prices[i] - Buying > profit){
                profit = prices[i] - Buying;
            }
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
      int buyprice = Integer.MAX_VALUE;  //from least  min to maximum
      int  maxprofit = 0; //no profit as of now
        int n = prices.length;

      for(int i=0;i<n;i++){// 0 to n
        if(buyprice < prices[i]){ // today i buy should be lesser then the prices array
            int profit = prices[i] - buyprice; //if yes then i got this
            maxprofit = Math.max(maxprofit,profit);//check and add to max profit
        }else{
            buyprice = prices[i];
        }
      } 
      return maxprofit;
    }
}
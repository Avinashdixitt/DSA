class Solution {
    public int maxProfit(int[] prices) {
        int mini=10000;
        int maxu=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<mini)
            mini=prices[i];
            else if(prices[i]>mini)
            maxu=Math.max(maxu,prices[i]-mini);
        }return maxu;
        
    }
}
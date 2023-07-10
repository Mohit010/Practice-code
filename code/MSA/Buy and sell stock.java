class Solution {
    public int maxProfit(int[] prices) {
        int lo = Integer.MAX_VALUE;
        int p = 0;
        int tp = 0;

        for(int i=0;i<prices.length;i++){
            if(lo > prices[i]){
                lo = prices[i];
            }
            tp = prices[i] - lo;
            if(p < tp){
                p = tp;
            }
        }
        return p;
    }
}
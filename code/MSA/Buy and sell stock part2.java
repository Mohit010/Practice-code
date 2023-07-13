class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = n-1;
        int j = n-2;
        int ans = 0;

        while(j >= 0){
            int diff = prices[i] - prices[j];
            if( diff > 0){
                ans += diff; 
            }
            j--;
            i--;
        }
        return ans;
    }
}
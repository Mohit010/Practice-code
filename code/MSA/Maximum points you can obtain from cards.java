class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int ksum = 0;
        for(int i=0;i<k;i++){
            ksum += cardPoints[i];
        }
        int curr = ksum;
        int l = n-1;
        for(int i=k-1;i>=0;i--){
            curr -= cardPoints[i];
            curr += cardPoints[l];
            l--;
            ksum = Math.max(ksum,curr);
        } 
        return ksum;
    }
}

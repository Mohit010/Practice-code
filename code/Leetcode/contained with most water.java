class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int area = 0;
        int ans = 0;
        while(lo < hi){
            area = Math.min(height[lo],height[hi]) * (hi - lo);
            ans = Math.max(ans,area);
            if(height[lo] < height[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return ans;
    }
}
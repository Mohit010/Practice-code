class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]) == false){
                hs.add(nums[i]);
            }else{
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}

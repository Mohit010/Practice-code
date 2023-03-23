class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>hm = new HashMap<>();
        int left = 0;
        int max = 0;
        int mfc = 0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            hm.put(ch,hm.getOrDefault(ch,0) + 1);
            mfc = Math.max(mfc,hm.get(ch));

            if((right-left+1)-mfc > k){
                char exch = s.charAt(left);
                hm.put(exch,hm.get(exch)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
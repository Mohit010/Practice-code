class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        int lo = 0;
        int hi = s.length() - 1;
        while(lo < hi){
            char left = s.charAt(lo);
            char right = s.charAt(hi);

            if(!Character.isLetterOrDigit(left)) lo++;
            else if(!Character.isLetterOrDigit(right)) hi--;
            else{
                if(Character.toLowerCase(left) != Character.toLowerCase(right)) return false;
                lo++;
                hi--;
            }
        }
        return true;
    }
}

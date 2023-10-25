class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int n = s.length();
        int start = 0;
        int max_count = 0;
        int max_length = 0;

        for(int end=0;end<n;end++){
            char ch = s.charAt(end);
            arr[ch - 'A']++;
            int curr = arr[ch-'A'];
            max_count = Math.max(max_count,curr);

            while(end-start+1 - max_count > k){
                char ah = s.charAt(start);
                arr[ah - 'A']--;
                start++;
            }

            max_length = Math.max(max_length,end-start+1);
        }
        return max_length;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String,List>hm = new HashMap<String,List>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

        String key = String.valueOf(ch);
          if(!hm.containsKey(key)){
            hm.put(key,new ArrayList());
          }
            hm.get(key).add(s);
           
        }
       return new ArrayList(hm.values());
    }
}
class Solution {
    public static int max(int candies[]){
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>list = new ArrayList<Boolean>();
      // List<Boolean> list = Booleans.asList(arr);
        int max = max(candies);
        for(int i=0;i<candies.length;i++){
            if( (candies[i] + extraCandies) >= max ){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
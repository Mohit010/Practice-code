class SmallestIntfinteSet{
    HashSet<Integer>hs;
    int curr;//

    public SmallestIntfinteSet(){
        hs = new HashSet<>();
        curr = 1;
    }

    public int popSmallest(){
        if(hs.size() != 0){
            int res = Collections.min(hs);
            hs.remove(res);
            return res;
        }else{
            curr++;
            return curr-1;
        }
    }

    public void addBack(int num){
        if(num < curr){
            hs.add(num);
        }
    }
}
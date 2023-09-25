import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        HashMap<Character,Integer>map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }
        // char chh[] = s.toCharArray();
        // for(char ch : chh){
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch) + 1);
        //     }else{
        //         map.put(ch,1);
        //     }
        // }
        for(Map.Entry a : map.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue() + " ");
        }
    }
}
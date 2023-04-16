import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0){
            String s = scn.next();
            int n = s.length();
            long ans = 0;
            
            StringBuilder res = new StringBuilder();
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '_'){
                    if(res.length() == 0 || res.charAt(res.length()-1) != '^')
                    res.append('^');
                    res.append(s.charAt(i));
                }else{
                    res.append(s.charAt(i));
                }
            }
            if(res.charAt(res.length()-1) == '_'){
                res.append('^');
            }
            ans = Math.max(res.length(),2) - n;
            System.out.println(ans);
        }
    }
}
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,1000000007);
        dp[0] = 0;
        
        for(int i=1;i<=n;i++){
            String s = Integer.toString(i);
            for(int j=0;j<s.length();j++){
                int digit = s.charAt(j) - '0';
                if(digit != 0){
                    dp[i] = Math.min(dp[i] , dp[i - digit] + 1);
                }
            }
        }
        System.out.println(dp[n]);
    }
}
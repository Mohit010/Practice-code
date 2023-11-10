import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int mod = 1000000007;
        int n = scn.nextInt();
        int dp[] =  new int[n+1];
        dp[0] = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(j <= i){
                    dp[i] = (dp[i] + dp[i-j]) % mod;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
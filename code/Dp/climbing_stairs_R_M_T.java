import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        // int ans = solve(0,n,dp);
        int ans = tab(n);
        System.out.println(ans);
    }
    public static int solve(int i , int n , int dp[]){
        
        if(i == n) return 1;
        else if(i > n) return 0;
        
        if(dp[i] != -1) return dp[i];
        
        int a1 = solve(i+1,n,dp);
        int a2 = solve(i+2,n,dp);
        int a3 = solve(i+3,n,dp);
        int ans = a1 + a2 + a3;
        dp[i] = ans;
        return ans;
    }
    public static int tab(int n){
        int dp[] = new int[n+1];
        dp[n] = 1;
        for(int i=n-1;i>=0;i--){
            if(i == n-1){
                dp[i] = dp[i+1];
            }else if(i == n-2){
                dp[i] = dp[i+1] + dp[i+2];
            }else{
                dp[i] = dp[i+1] + dp[i+2] + dp[i+3];
            }
        }
        return dp[0];
    }
}
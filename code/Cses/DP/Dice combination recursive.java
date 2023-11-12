import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = solve(n,dp);
        System.out.println(ans);
    }
    public static int solve(int n , int dp[]){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        
        int a1 = solve(n-1,dp);
        int a2 = solve(n-2,dp);
        int a3 = solve(n-3,dp);
        int a4 = solve(n-4,dp);
        int a5 = solve(n-5,dp);
        int a6 = solve(n-6,dp);
        dp[n] = a1+a2+a3+a4+a5+a6;
        return a1+a2+a3+a4+a5+a6;
    }
}

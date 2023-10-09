import java.util.*;
// 3 -> 14
// dp 10 -> 31

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countPathsTab(n,new int[n+1],0);
        System.out.println(" " + " ans is " + cp + " ");
    }
    public static int countPaths(int n,int dp[],int count){
        System.out.println("count");
        if(n == 0) return 1;
        else if(n < 0) return 0;
        
        if(dp[n] != 0) return dp[n];
        int nm1 = countPaths(n-1,dp,count);
        int nm2 = countPaths(n-2,dp,count);
        int nm3 = countPaths(n-3,dp,count);
        int ans = nm1 + nm2 + nm3;
        dp[n] = ans;
        return ans;
    }
    public static int countPathsTab(int n,int dp[],int coutn){
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i == 1) dp[i] = dp[i-1];
            else if(i == 2) dp[i] = dp[i-1] + dp[i-2];
            else dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}
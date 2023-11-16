import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int dp[] = new int[x+1];
        Arrays.fill(dp,-1);
        int ans = solve(x,0,arr,dp);
        System.out.println(ans);
    }
    public static int solve(int x , int s , int arr[], int dp[]){
        if(s == x) return 1;
        
        if(dp[s] != -1) return dp[s];
        int ways = 0;
        
        for(int i=0;i<arr.length;i++){
            if(s + arr[i] <= x){
                int a1 = solve(x,s+arr[i],arr,dp);
                ways += a1;
            }
        }
        dp[s] = ways;
        return ways;
    }
}

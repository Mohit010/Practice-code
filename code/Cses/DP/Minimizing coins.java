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
        int mod = 1000000007;
        int dp[] = new int[x+1];
        Arrays.fill(dp,mod);
        
        dp[0] = 0;
        for(int i=1;i<=x;i++){
            for(int j=0;j<n;j++){
                if(arr[j] <= i){
                    dp[i] = Math.min(dp[i] , dp[i-arr[j]] + 1);
                }
            }
        }
        if(dp[x] < mod){
            System.out.println(dp[x]);
        }else {
            System.out.println(-1);
        }
    }
}
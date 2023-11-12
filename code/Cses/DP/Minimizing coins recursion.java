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
        int b = 1000000007;
        int ans = solve(x,arr);
        System.out.println(ans);
    }
    public static int solve(int x , int arr[] ){
        if(x == 0){
            return 0;
        }
        
        int res = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= x){
                int ans = solve(x-arr[i],arr);
                if(ans != Integer.MAX_VALUE && ans+1 < res){
                    res = ans+1;
                }
            }
        }
        return res;
    }
}
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
        int ans = solve(x,0,arr);
        System.out.println(ans);
    }
    public static int solve(int x , int s , int arr[]){
        if(s == x) return 1;
        
        int ways = 0;
        
        for(int i=0;i<arr.length;i++){
            if(s + arr[i] <= x){
                int a1 = solve(x,s+arr[i],arr);
                ways += a1;
            }
        }
        return ways;
    }
}

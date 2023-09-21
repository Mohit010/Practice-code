import java.util.*;
//1000 - bf
//19
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int ans = 0;
        int a = 0;
        for(int i=1;i * i <= n;i++){
            a++;
            if(i * i == n){
                count++;
                ans = i;
            }
        }
        System.out.println("A is " + a + " ");
        if(count == 1){
            System.out.println("ans is " + ans);
        }else{
            System.out.println("-1");
        }
        
        // long count = 0;
        // long ans = 0;
        // long lo = 1;
        // long hi = n;
        // int a = 0;
        // while(lo <= hi){
        //     a++;
        //     long mid = (lo + hi) / 2;
        //     if(mid * mid == n){
        //         count++;
        //         ans = mid;
        //         break;
        //     }else if(mid * mid < n){
        //         lo = mid + 1;
        //     }else if(mid * mid > n) {
        //         hi = mid - 1;
        //     }
        // }
        // System.out.println("a is " + a + " ");
        // if(count == 0){
        //     System.out.println("-1");
        // }else{
        //     System.out.println("ans is " + ans);
        // }
    }
}
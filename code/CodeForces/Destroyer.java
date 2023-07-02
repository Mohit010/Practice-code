// import java.util.*;

// public class Main{
//     public static void main(String args[]){
//         Scanner scn = new Scanner(System.in);
//         int t = scn.nextInt();

//         while(t-- > 0){
//             int n = scn.nextInt();
//             int arr[] = new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i] = scn.nextInt();
//             }

//             if(arr.length == 1){
//                 if(arr[0] == 0){
//                     System.out.println("YES");
//                 }else if(arr[0] != 0){
//                     System.out.println("NO");
//                 }
//             }else{
//                 int count = 0;
//             int i = 0;
//             int j = 1;
//             while(j < n){
//                 if(arr[i] == arr[i+1] || arr[i+1] - arr[i] == 1 || arr[i+1] == 0 ){
//                     i++;
//                     j++;
//                 }else {
//                     count++;
//                     break;
//                 }
//             }
            
//             if(count == 0){
//                 System.out.println("YES");
//             }else{
//                 System.out.println("NO");
//             }
//             }
//         }
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();

        while (cases-- > 0) {
            int n = scn.nextInt();

            int[] cnt = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int d = scn.nextInt();
                if (d < n) {
                    cnt[d]++;
                } else {
                    cnt[n] = (int) 1e6;
                }
            }

            boolean good = true;
            for (int i = 1; i <= n; i++) {
                if (cnt[i] > cnt[i - 1]) {
                    good = false;
                    break;
                }
            }

            System.out.println(good ? "YES" : "NO");
        }
    }
}


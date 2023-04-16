import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0){
            String s = scn.next();
            int n = s.length();
            long ans = 0;
            
            StringBuilder res = new StringBuilder();
            for(int i=0;i<n;i++){
                if(s.charAt(i) == '_'){
                    if(res.length() == 0 || res.charAt(res.length()-1) != '^')
                    res.append('^');
                    res.append(s.charAt(i));
                }else{
                    res.append(s.charAt(i));
                }
            }
            if(res.charAt(res.length()-1) == '_'){
                res.append('^');
            }
            ans = Math.max(res.length(),2) - n;
            System.out.println(ans);
        }
    }
}



// string s;
// cin >> s;

// int n = s.size();

// int longest =0;
// int current = 0;

// int count = 0;

// for(int i=0;i<n;i++){
// 	if(s[i] == '0'){
// 		++count;
//         longest = max(longest,current);
//         current =0;
//         continue;
// 	}
//     ++current;

// }

// if(count == 0){
//     int ans = n * n;
//     cout << ans << nl;
//     return;
// }

// int extra = 0;

// for(int i=0;i<n;i++){
//     if(s[i] == '1'){
//         ++extra;
//     }else{
//         break;
//     }
// }

// for(int i=n;i>-1;i--){
//     if(s[i] == '1'){
//         ++extra;
//     }else{
//         break;
//     }
// }

// longest = max({longest,current,extra});

// int ans = 0;

// for(int i=1;i<longest+1;i++){
//     ans = max(ans,i*(longest-i+1));
// }

// cout<<ans<<nl;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String s = scanner.nextLine();
//         int n = s.length();

//         int longest = 0;
//         int current = 0;
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == '0') {
//                 count++;
//                 longest = Math.max(longest, current);
//                 current = 0;
//                 continue;
//             }
//             current++;
//         }

//         if (count == 0) {
//             int ans = n * n;
//             System.out.println(ans);
//             return;
//         }

//         int extra = 0;

//         for (int i = 0; i < n; i++) {
//             if (s.charAt(i) == '1') {
//                 extra++;
//             } else {
//                 break;
//             }
//         }

//         for (int i = n - 1; i >= 0; i--) {
//             if (s.charAt(i) == '1') {
//                 extra++;
//             } else {
//                 break;
//             }
//         }

//         longest = Math.max(Math.max(longest, current), extra);

//         int ans = 0;

//         for (int i = 1; i < longest + 1; i++) {
//             ans = Math.max(ans, i * (longest - i + 1));
//         }

//         System.out.println(ans);
//     }
// }

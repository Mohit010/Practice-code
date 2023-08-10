// #include<bits/stdc++.h>
// using namespace std;
// // #define int long long
// #define float long double
// #define ll long long
 
// long long binpow(long long a, long long b) {
//     long long res = 1;
//     while (b > 0) {
//         if (b & 1)
//             res = res * a;
//         a = a * a;
//         b >>= 1;
//     }
//     return res;
// }
 
 
 
// void solve(){
     
//      int n,a;
//      cin >> n;
//      int odd = 1;
//      for(int i=0;i<n;i++){
//         cin >> a;
//         if(a % 2 != 0){
//             odd++;
//         }
//      }
//      if((odd + 1) % 2 == 0){
//         cout << "Yes" << '\n';
//      }else{
//         cout << "No" << '\n';
//      }
// }
 
// int32_t main(){
//      #ifndef ONLINE_JUDGE
//      freopen("input.txt", "r", stdin);
//      freopen("output.txt", "w", stdout);
//      #endif // ONLINE_JUDGE
//       ios_base::sync_with_stdio(0);
//       cin.tie(0);
 
//          int t;
//          cin >> t;
//          while(t-- > 0){
//             solve();
//          }
// }
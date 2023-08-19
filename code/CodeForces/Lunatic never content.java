#include<bits/stdc++.h>
using namespace std;
#define int long long
#define float long double
#define ll long long
const int mod = 1e9 + 7;

long long binpow(long long a, long long b) {
    long long res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a;
        a = a * a;
        b >>= 1;
    }
    return res;
}

void solve(){
    int n;
    cin >> n;
    vector<int>a(n);
    for(int i=0;i<n;i++){
        cin >> a[i];
    } 
    int ans = 0;
    for(int i=0;i<n;i++){
        // ans = _gcd(ans,abs(a[i] - a[n-i+1]));
         ans = __gcd(ans, abs(a[i] - a[n - i - 1]));
    }
    cout << ans << '\n';
}
int32_t main(){
     #ifndef ONLINE_JUDGE
     freopen("input.txt", "r", stdin);
     freopen("output.txt", "w", stdout);
     #endif // ONLINE_JUDGE
      ios_base::sync_with_stdio(0);
      cin.tie(0);

         int t;
         cin >> t;
         while(t-- > 0){
            solve();
         }
}
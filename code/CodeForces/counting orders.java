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
    int ans = 1;
    vector<int> a(n),b(n),res(n);
    for(int i=0;i<n;i++){
        cin >> a[i];
    }
    for(int i=0;i<n;i++){
        cin >> b[i];
    }
    sort(a.begin(),a.end());
    sort(b.begin(),b.end());
    int j = 0;
    for(int i=0;i<n;i++){
        
        while(j < n && a[j] <= b[i]){
            j++;
        }
        if(j != n){
            res[i] = n - j; 
        }
    }
    sort(res.begin(),res.end());
    for(int i=0;i<n;i++){
        ans = ((ans % mod) * ((res[i]-i)%mod))%mod;
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





#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int s,n;
        cin>>s>>n;
        int a[n];
        for(int i=0;i<n;i++)
        cin>>a[i];
        int dp[s+1];
        dp[0]=0;
        for(int i=1;i<=s;i++)
        dp[i]=INT_MAX;
      
        for(int i=1;i<=s;i++){
            for(int j=0;j<n;j++){
                if(a[j]<=i){
                    if(dp[i-a[j]]!=INT_MAX){
                    dp[i]=min(dp[i-a[j]]+1,dp[i]);
                       
                    }
                }
            }
        }
        if(dp[s]!=INT_MAX)
        cout<<dp[s]<<endl;
        else
        cout<<-1<<endl;
    }
	//code
	return 0;
}
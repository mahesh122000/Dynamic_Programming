#include <bits/stdc++.h>
using namespace std;
long int dp[21][21][21];
long int find(int v[21][21],int i,int j,int n,int k){
    if(i==n-1 && j==n-1){
        return v[i][j]==k?1:0;
    }
    if(k<0)
    return 0;
    if(i>=n || j>=n)
    return 0;
    if(dp[i][j][k]!=-1)
    return dp[i][j][k];
    dp[i][j][k]= find(v,i+1,j,n,k-v[i][j])+find(v,i,j+1,n,k-v[i][j]);
    return dp[i][j][k];
}
int main() {
	int t;
	cin>>t;
	while(t--){
	    int k,n;
	    cin>>k>>n;
	    int v[21][21];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++)
	        cin>>v[i][j];
	    }
	   
	    memset(dp,-1,sizeof(dp));
	    long int ans=find(v,0,0,n,k);
	    cout<<ans<<endl;
	    
	}
	return 0;
}
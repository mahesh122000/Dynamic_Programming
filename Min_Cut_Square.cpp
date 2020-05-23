#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n,m;
	    cin>>n>>m;
	    int a[n+1][m+1];
	    for(int i=0;i<=n;i++)
	    {for(int j=0;j<=m;j++)
	    {if(i==0||j==0)
	    a[i][j]=1;
	    else
	    a[i][j]=0;
	    }}
	    for(int i=1;i<=n;i++)
	    {for(int j=1;j<=m;j++)
	    {int v=INT_MAX;
	    if(i==j)
	    {a[i][j]=1;
	    continue;}
	    for(int k=1;k<j;k++)
	    v=min(v,a[i][k]+a[i][j-k]);
	    for(int k=1;k<i;k++)
	    v=min(v,a[k][j]+a[i-k][j]);
	    a[i][j]=v;
	    }}
	    cout<<a[n][m]<<endl;
	}
	return 0;
}
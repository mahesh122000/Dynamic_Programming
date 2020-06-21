#include<bits/stdc++.h>
using namespace std;

int lcs( string X, string Y) 
{
    int m=X.length();
    int n=Y.length();
    int L[m+1][n+1]; 
    int i, j; 
    for (i=0; i<=m; i++) 
    { 
     for (j=0; j<=n; j++) 
     { 
       if (i == 0 || j == 0) 
         L[i][j] = 0; 
   
       else if (X[i-1] == Y[j-1]) 
         L[i][j] = L[i-1][j-1] + 1; 
   
       else
         L[i][j] = max(L[i-1][j], L[i][j-1]); 
     } 
   } 
   return L[m][n]; 
} 
int main()
 {
	int t,n;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    string s[n];
	    for(int i=0;i<n;i++)
	    cin>>s[i];
	    int max=0;
	    string ans="";
	    string a;
	    cin>>a;
	    for(int i=0;i<n;i++)
	    {
	        int v=lcs(a,s[i]);
	        int l=s[i].length();
	        if(v==l)
	        {
	            if(max<v)
	            {
	                max=v;
	                ans=s[i];
	             }
	        }
	    }
	    cout<<ans<<endl;
	}
	return 0;
}
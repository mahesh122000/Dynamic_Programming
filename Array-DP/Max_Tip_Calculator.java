import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int ans=0;
     static int dp[][];
     static void find(int a[],int b[],int i,int n,int val,int p,int q)
     {
        if(i==n)
        {
            ans=Math.max(ans,val);
            return;
        }
        if(i>n)
        return;
        if(p>0)
        find(a,b,i+1,n,val+a[i],p-1,q);
        if(q>0)
        find(a,b,i+1,n,val+b[i],p,q-1);
     }
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int p=s.nextInt();
	 int q=s.nextInt();
	 dp=new int[p+1][q+1];
	 for(int i=0;i<=p;i++)
	 {
	     for(int j=0;j<=q;j++)
	     {
	         dp[i][j]=-1;
	     }
	 }
	 int a[]=new int[n];
	 int b[]=new int[n];
	 ans=0;
	 for(int i=0;i<n;i++)
	 {
	     a[i]=s.nextInt();
	 }
	 for(int i=0;i<n;i++)
	 {
	     b[i]=s.nextInt();
	 }
	 find(a,b,1,n,a[0],p-1,q);
	 find(a,b,1,n,b[0],p,q-1);
	 System.out.println(ans);
	 }}
}


/*
#include<bits/stdc++.h>

using namespace std;

typedef int ll;

ll maxTip(ll A[], ll B[], int n, int x, int y)
{
    ll D[106][106][106];
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=x;j++)
        {
            for(int k=i-j;k<=y;k++)
            {
                D[i][j][k] = 0;
            }
        }
    }
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=x;j++)
        {
            D[i][j][0] = D[i-1][j-1][0] + A[i-1];
        }
    }
    
    for(int i=1;i<=n;i++)
    {
        for(int k=1;k<=y;k++)
        {
            D[i][0][k] = D[i-1][0][k-1] + B[i-1];
        }
    }
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=x;j++)
        {
            for(int k=1;k<=y;k++)
            {
                ll incl_j = D[i-1][j-1][k] + A[i-1];
                ll incl_k = D[i-1][j][k-1] + B[i-1];
                 
                D[i][j][k] = max(incl_j, incl_k);
            }
        }
    }
    
    // for(int i=0;i<=n;i++)
    // cout<<D[i][x][y]<<" ";
    // cout<<endl;
    
    return D[n][x][y];
}

int main()
 {
	//code
    int t;
    cin>>t;
    
    while(t--)
    {
        int n, x, y;
        cin>>n>>x>>y;
        
        ll A[106]={0}, B[106]={0};
        
        for(int i=0;i<n;i++)
        cin>>A[i];
        
        for(int i=0;i<n;i++)
        cin>>B[i];
        
        cout<<maxTip(A, B, n, x, y)<<endl;
    }
	return 0;
}

*/
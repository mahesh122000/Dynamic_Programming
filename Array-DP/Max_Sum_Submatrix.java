import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         int m=s.nextInt();
	         int a[][]=new int[n][m];
	         int dp[][]=new int[n+1][m+1];
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<m;j++)
	             {
	                 a[i][j]=s.nextInt();
	                 dp[i+1][j+1]=a[i][j]-dp[i][j]+dp[i][j+1]+dp[i+1][j];
	             }
	         }
	         int tt=s.nextInt();
	         for(int k=0;k<tt;k++)
	         {
	             int p=s.nextInt();
	             int q=s.nextInt();
	             int ans=Integer.MIN_VALUE;
	             for(int i=p;i<=n;i++)
	             {
	                 for(int j=q;j<=m;j++)
	                 {
	                     ans=Math.max(ans,dp[i][j]-dp[i-p][j]-dp[i][j-q]+dp[i-p][j-q]);
	                 }
	             }
	             System.out.print(ans+" ");
	         }
	         System.out.println();
	     }
	 }
}



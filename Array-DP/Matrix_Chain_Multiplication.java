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
	     int a[]=new int[n];
	     for(int i=0;i<n;i++)
	     a[i]=s.nextInt();
	     int dp[][]=new int[n][n];
	     for(int i=0;i<n;i++)
	     dp[i][i]=0;
	     for(int l=2;l<n;l++)
	     {for(int i=1;i<n-l+1;i++)
	     {int j=i+l-1;
	     dp[i][j]=Integer.MAX_VALUE;
	     for(int k=i;k<j;k++)
	     {int q=dp[i][k]+dp[k+1][j]+a[i-1]*a[k]*a[j];
	     dp[i][j]=Math.min(dp[i][j],q);
	     }}}
	     System.out.println(dp[1][n-1]);
	 }
	 }
}
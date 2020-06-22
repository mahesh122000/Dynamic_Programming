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
	     long a[]=new long[n];
	     long b[]=new long[m];
	     for(int i=0;i<n;i++)
	     a[i]=s.nextLong();
	     for(int i=0;i<m;i++)
	     b[i]=s.nextLong();
	     long dp[][]=new long[n+1][m+1];
	     for(int i=1;i<=n;i++)
	     {
	         for(int j=1;j<=m;j++)
	         {
	             if(i>j)
	             dp[i][j]=Math.max(dp[i-1][j-1]+a[i-1]*b[j-1],dp[i-1][j]);
	             if(i==j)
	             dp[i][j]=a[i-1]*b[j-1]+dp[i-1][j-1];
	         }
	     }
	     System.out.println(dp[n][m]);
	 }
	 }
}
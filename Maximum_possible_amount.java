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
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();}
	 int dp[][]=new int[n][n];
	 for(int k=0;k<n;k++)
	 {for(int i=0,j=k;j<n;i++,j++)
	 {int x=0,y=0,z=0;
	 if(i+2<=j)
	 x=dp[i+2][j];
	 if(i<=j-2)
	 z=dp[i][j-2];
	 if(i+1<=j-1)
	 y=dp[i+1][j-1];
	 dp[i][j]=Math.max(a[i]+Math.min(x,y),a[j]+Math.min(y,z));}}
	 System.out.println(dp[0][n-1]);}}}
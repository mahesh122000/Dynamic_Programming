import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void print(int a[][],int i,int j)
     {
         if(i==j)
         {System.out.print((char)(i+'A'-1));
         return;}
         System.out.print('(');
         print(a,i,a[i][j]);
         print(a,a[i][j]+1,j);
         System.out.print(')');
     }
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
	     int d[][]=new int[n][n];
	     for(int l=2;l<n;l++)
	     {for(int i=1;i<n-l+1;i++)
	     {int j=i+l-1;
	     dp[i][j]=Integer.MAX_VALUE;
	     for(int k=i;k<j;k++)
	     {int q=dp[i][k]+dp[k+1][j]+a[i-1]*a[k]*a[j];
	     if(dp[i][j]>q)
	     {dp[i][j]=q;
	     d[i][j]=k;
	     }}}}
	     print(d,1,n-1);
	     System.out.println();
	 }
	 }
}
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
	         for(int i=0;i<n;i++)
	         {for(int j=0;j<m;j++)
	         a[i][j]=s.nextInt();
	         }
	         int dp[][]=new int[n][m];
	         int min[][]=new int[n][m];
	         
	         dp[0][0]=a[0][0];
	         if(a[0][0]>=0)
	         min[0][0]=0;
	         else
	         min[0][0]=a[0][0];
	         
	         for(int i=1;i<m;i++)
	         {dp[0][i]=dp[0][i-1]+a[0][i];
	         if(a[0][i]>=0)
	         min[0][i]=min[0][i-1];
	         else
	         min[0][i]=Math.min(min[0][i-1],dp[0][i]);
	         }
	         
	         for(int i=1;i<n;i++)
	         {dp[i][0]=dp[i-1][0]+a[i][0];
	         if(a[i][0]>=0)
	         min[i][0]=min[i-1][0];
	         else
	         min[i][0]=Math.min(min[i-1][0],dp[i][0]);
	         }
	         
	         for(int i=1;i<n;i++)
	         {for(int j=1;j<m;j++)
	         {if(min[i-1][j]>min[i][j-1])
	             {
	                 dp[i][j]=dp[i-1][j]+a[i][j];
	                 if(a[i][j]>=0)
	                 min[i][j]=min[i-1][j];
	                 else
	                 min[i][j]=Math.min(min[i-1][j],dp[i][j]);
	             }
	          else if(min[i][j-1]>min[i-1][j])
	             {
	                  dp[i][j]=dp[i][j-1]+a[i][j];
	                  if(a[i][j]>=0)
	                  min[i][j]=min[i][j-1];
	                  else
	                  min[i][j]=Math.min(min[i][j-1],dp[i][j]);
	             }
	          else
	             {
	                  if(dp[i-1][j]>dp[i][j-1])
	                  {
	                      dp[i][j]=dp[i-1][j]+a[i][j];
	                      if(a[i][j]>=0)
	                      min[i][j]=min[i-1][j];
	                      else
	                      min[i][j]=Math.min(min[i-1][j],dp[i][j]);
	                  }
	                  else
	                  {
	                      dp[i][j]=dp[i][j-1]+a[i][j];
	                      if(a[i][j]>=0)
	                      min[i][j]=min[i][j-1];
	                      else
	                      min[i][j]=Math.min(min[i][j-1],dp[i][j]);
	                  }
	             }
	         }}
	         
	     System.out.println(Math.abs(min[n-1][m-1])+1);
	     }
	 }
}

        
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
	 {int x=s.nextInt();
	 int a[]=new int[3];
	 for(int i=0;i<3;i++)
	 a[i]=s.nextInt();
	 int val[]=new int[3];
	 for(int i=0;i<3;i++)
	 val[i]=s.nextInt();
	 int dp[][]=new int[4][x+1];
	 for(int i=0;i<=3;i++)
	 {for(int j=0;j<=x;j++)
	 dp[i][j]=Integer.MAX_VALUE;}
	 for(int i=0;i<4;i++)
	 dp[i][0]=0;
	 for(int i=1;i<=3;i++)
	 {for(int j=1;j<=x;j++)
	 {if(j>=a[i-1])
	 dp[i][j]=Math.min(dp[i-1][j],dp[i][j-a[i-1]]+val[i-1]);
	     else
	     dp[i][j]=Math.min(dp[i-1][j],val[i-1]);
	 }}
	 System.out.println(dp[3][x]);}
	 }
}